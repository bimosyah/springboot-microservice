package com.bimo.project.customer.service.impl;

import com.bimo.project.clients.fraud.FraudCheckResponse;
import com.bimo.project.clients.fraud.FraudClient;
import com.bimo.project.customer.entity.CustomerEntity;
import com.bimo.project.customer.repository.CustomerRepository;
import com.bimo.project.customer.request.CustomerRequest;
import com.bimo.project.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    FraudClient fraudClient;

    @Override
    public void registerCustomer(CustomerRequest customerRequest) {
        CustomerEntity customer = CustomerEntity.builder()
                .firstName(customerRequest.getFirstName())
                .lastName(customerRequest.getLastName())
                .email(customerRequest.getEmail())
                .build();

        customerRepository.saveAndFlush(customer);

        FraudCheckResponse fraudster = fraudClient.isFraudster(customer.getId());

        assert fraudster != null;
        if (fraudster.getIsFraudster()) {
            throw new IllegalStateException("fraudster");
        }
    }
}
