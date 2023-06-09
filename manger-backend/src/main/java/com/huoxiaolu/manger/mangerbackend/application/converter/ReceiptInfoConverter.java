package com.huoxiaolu.manger.mangerbackend.application.converter;

import com.huoxiaolu.manger.mangerbackend.api.request.ReceiptCreateRequest;
import com.huoxiaolu.manger.mangerbackend.domain.aggregate.ReceiptInfo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

/**
 * @author xiaolu.huo
 */
@Mapper(componentModel = "spring")
public interface ReceiptInfoConverter {
    /**
     * 将request请求参数转化为domain对象
     * @param request 请求参数
     * @return domain对象
     */
    @Mapping(target = "endTime", source = "request", qualifiedByName = "mapToEndTime")
    @Mapping(target = "code", source = "code")
    @Mapping(target = "userName", source = "request.name")
    @Mapping(target = "id", ignore = true)
    ReceiptInfo requestToReceiptInfo(ReceiptCreateRequest request, String code);

    @Named("mapToEndTime")
    default LocalDateTime mapToEndTime(ReceiptCreateRequest request) {
        LocalDate date = request.getStartTime().plusMonths(request.getTerm()).toLocalDate();
        return date.atTime(23,59,59);
    }
}
