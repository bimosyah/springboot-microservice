package com.bimo.project.fraud.controller.v1.impl;

import com.bimo.project.fraud.controller.v1.FraudController;
import com.bimo.project.fraud.response.FraudCheckResponse;
import com.bimo.project.fraud.service.FraudHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FraudControllerImpl implements FraudController {

    @Autowired
    FraudHistoryService fraudHistoryService;

    @Override
    public FraudCheckResponse isFraudster(Integer customerId) {
        Boolean fraudulentCustomer = fraudHistoryService.isFraudulentCustomer(customerId);
        log.info("fraud check request for customer {}", customerId);
        return FraudCheckResponse.builder().isFraudster(fraudulentCustomer).build();
    }
}
