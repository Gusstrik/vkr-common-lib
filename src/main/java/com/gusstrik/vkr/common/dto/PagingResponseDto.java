package com.gusstrik.vkr.common.dto;

import lombok.Data;

import java.util.List;

@Data
public class PagingResponseDto<T> {
    private List<T> data;
    private Boolean success;
    private List<OperationError> errorList;
    private Integer page;
    private Integer limit;
    private Long total;
}
