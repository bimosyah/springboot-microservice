package com.bimo.project.fraud.utils;

import com.bimo.project.fraud.response.BaseResponse;
import org.springframework.http.ResponseEntity;

public class ResponseHelper {
    public static ResponseEntity<BaseResponse> buildOkResponse(Object data) {
        BaseResponse mainResponse = BaseResponse.builder()
                .data(data)
                .success(true).build();

        return ResponseEntity.ok(mainResponse);
    }
}
