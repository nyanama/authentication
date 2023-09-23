package com.sastra.authentication.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class FailedResponse {
    private String reason;
}
