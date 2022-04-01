package com.bimo.project.customer.controller.v1.impl;

import com.bimo.project.customer.controller.v1.CustomerController;
import com.bimo.project.customer.request.CustomerRequest;
import com.bimo.project.customer.response.BaseResponse;
import com.bimo.project.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Slf4j
public class CustomerControllerImpl implements CustomerController {

    @Autowired
    CustomerService customerService;

    @Override
    public ResponseEntity<BaseResponse> registerCustomer(CustomerRequest customerRequest) {
        log.info("new customer registration {}", customerRequest);
        customerService.registerCustomer(customerRequest);
        return null;
    }
}
