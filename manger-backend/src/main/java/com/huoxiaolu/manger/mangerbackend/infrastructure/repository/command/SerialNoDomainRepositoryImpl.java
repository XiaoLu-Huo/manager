package com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command;

import com.huoxiaolu.manger.mangerbackend.domain.repository.SerialNoDomainRepository;
import com.huoxiaolu.manger.mangerbackend.infrastructure.dataobject.persist.SerialNoDO;
import com.huoxiaolu.manger.mangerbackend.infrastructure.repository.command.jdbc.SerialNoRepository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import static com.huoxiaolu.manger.mangerbackend.shared.constant.Constants.*;

/**
 * @author xiaolu.huo
 */
@Slf4j
@Repository
@RequiredArgsConstructor
public class SerialNoDomainRepositoryImpl implements SerialNoDomainRepository {

    private final SerialNoRepository serialNoRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public String generate(String type) {
        LocalDate currentDate = LocalDate.now();
        SerialNoDO serialNoDO = serialNoRepository.findByTypeAndMonthAndYear(type, currentDate.getMonthValue(),currentDate.getYear());
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String yearMonthDay = pattern.format(LocalDateTime.now()).replace(MIDDLE_DASH, EMPTY);
        if (Objects.isNull(serialNoDO)) {
            String serialNo = yearMonthDay.concat(START_NO);
            serialNoRepository.save(SerialNoDO.of(type,currentDate,serialNo));
            return type.concat(serialNo);
        } else {
            String newSerialNo;
            if (serialNoDO.getSerialNo().startsWith(yearMonthDay)) {
                newSerialNo = String.valueOf(Math.addExact(Long.parseLong(serialNoDO.getSerialNo()), 1));
            } else {
                newSerialNo = yearMonthDay.concat(START_NO);
            }
            serialNoDO.setSerialNo(newSerialNo);
            serialNoRepository.save(serialNoDO);
            return type.concat(newSerialNo);
        }
    }
}
