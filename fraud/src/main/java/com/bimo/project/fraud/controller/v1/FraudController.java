package com.bimo.project.fraud.controller.v1;

import com.bimo.project.fraud.response.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
public interface FraudController {

    @GetMapping("/{customerId}")
    ResponseEntity<BaseResponse> isFraudster(@PathVariable Integer customerId);

}
