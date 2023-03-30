package com.huoxiaolu.manger.mangerbackend.infrastructure.dataobject.persist;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author xiaolu.huo
 */
@ToString
@Getter
@Setter
@Builder
@Table("serial_number")
public class SerialNoDO {
    @Id
    private Long id;
    private String type;
    private Integer month;
    private Integer year;
    private String serialNo;

    public static SerialNoDO of(String type, LocalDate currentDate, String serialNo) {
        return SerialNoDO.builder()
                .type(type)
                .month(currentDate.getMonthValue())
                .year(currentDate.getYear())
                .serialNo(serialNo)
                .build();
    }
}
