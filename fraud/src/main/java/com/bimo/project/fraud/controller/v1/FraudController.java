package com.bimo.project.fraud.controller.v1;

import com.bimo.project.fraud.response.BaseResponse;
import com.bimo.project.fraud.response.FraudHistoryResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
public interface FraudController {

    @GetMapping(path = "{customerId}")
    FraudHistoryResponse isFraudster(@PathVariable Integer customerId);

}
