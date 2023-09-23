package com.sastra.authentication.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SuccessResponse {
    private String key;
    private String value;
}
