package com.huoxiaolu.manger.mangerbackend.application.service.impl;

import com.huoxiaolu.manger.mangerbackend.application.service.SerialNoService;
import com.huoxiaolu.manger.mangerbackend.domain.repository.SerialNoDomainRepository;
import com.huoxiaolu.manger.mangerbackend.shared.enums.SerialNoType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author xiaolu.huo
 */
@Service
@RequiredArgsConstructor
public class SerialNoServiceImpl implements SerialNoService {

    private final SerialNoDomainRepository serialNoDomainRepository;

    @Override
    public String generate(SerialNoType serialNoType) {
        return serialNoDomainRepository.generate(serialNoType.name());
    }


}
