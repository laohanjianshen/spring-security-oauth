package com.xpc.oauth2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnEntity<T> {
    private Integer code;
    private String msg;
    private T data;

    public ReturnEntity(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
