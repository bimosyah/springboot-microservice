package com.bimo.project.fraud.controller.v1.impl;

import com.bimo.project.fraud.controller.v1.FraudController;
import com.bimo.project.fraud.response.BaseResponse;
import com.bimo.project.fraud.response.FraudHistoryResponse;
import com.bimo.project.fraud.service.FraudHistoryService;
import com.bimo.project.fraud.utils.ResponseHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FraudControllerImpl implements FraudController {

    @Autowired
    FraudHistoryService fraudHistoryService;

    @Override
    public ResponseEntity<BaseResponse> isFraudster(Integer customerId) {
        Boolean fraudulentCustomer = fraudHistoryService.isFraudulentCustomer(customerId);

        FraudHistoryResponse response = FraudHistoryResponse.builder().isFraudster(fraudulentCustomer).build();
        return ResponseHelper.buildOkResponse(response);
    }
}
