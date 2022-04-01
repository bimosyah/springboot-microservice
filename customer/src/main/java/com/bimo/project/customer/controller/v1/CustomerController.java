package com.bimo.project.customer.controller.v1;

import com.bimo.project.customer.request.CustomerRequest;
import com.bimo.project.customer.response.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers")
public interface CustomerController {
    @PostMapping
    ResponseEntity<BaseResponse> registerCustomer(@RequestBody CustomerRequest customerRequest);
}
