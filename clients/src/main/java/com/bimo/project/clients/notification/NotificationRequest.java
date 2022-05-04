package com.bimo.project.clients.notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequest {
    @JsonProperty("to_customer_id")
    Integer toCustomerId;

    @JsonProperty("to_customer_name")
    String toCustomerName;

    @JsonProperty("message")
    String message;
}
