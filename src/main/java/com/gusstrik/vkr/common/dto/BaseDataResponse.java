package com.gusstrik.vkr.common.dto;

import lombok.Data;

import java.util.List;

@Data
public class BaseDataResponse<T> {

    private T data;
    private Boolean success;
    private List<OperationError> errorList;
}
