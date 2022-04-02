package com.bimo.project.fraud.service.impl;

import com.bimo.project.fraud.entity.FraudHistoryEntity;
import com.bimo.project.fraud.repository.FraudHistoryRepository;
import com.bimo.project.fraud.service.FraudHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class FraudHistoryServiceImpl implements FraudHistoryService {

    @Autowired
    FraudHistoryRepository fraudHistoryRepository;

    @Override
    public Boolean isFraudulentCustomer(Integer customerId) {
        fraudHistoryRepository.save(FraudHistoryEntity.builder()
                .customerId(customerId)
                .createdAt(LocalDate.now())
                .isFraudster(false)
                .build());
        return false;
    }
}
