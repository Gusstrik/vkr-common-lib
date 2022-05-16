package com.gusstrik.vkr.common.dto;

import lombok.Data;

@Data
public class PagingRequestDto<T> {

    private T data;

    private Integer page = 0;

    private Integer limit = 10;
}
