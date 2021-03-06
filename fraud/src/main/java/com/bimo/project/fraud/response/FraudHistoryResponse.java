package com.bimo.project.fraud.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FraudHistoryResponse {
    @JsonProperty("is_fraudster")
    private Boolean isFraudster;
}
