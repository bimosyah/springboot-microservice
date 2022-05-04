package com.bimo.project.fraud.controller.v1;

import com.bimo.project.fraud.response.FraudCheckResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
public interface FraudController {

    @GetMapping(path = "{customerId}")
    FraudCheckResponse isFraudster(@PathVariable Integer customerId);

}
