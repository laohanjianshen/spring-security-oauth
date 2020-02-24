package com.xpc.oauth2.util;

import com.xpc.oauth2.model.ReturnEntity;
import org.springframework.http.HttpStatus;

public class ReturnUtil {
    public static <T> ReturnEntity<T> success() {
        return new ReturnEntity<T>(HttpStatus.OK.value(), HttpStatus.OK.toString());
    }

    public static <T> ReturnEntity<T> success(T data) {
        return new ReturnEntity<T>(HttpStatus.OK.value(), HttpStatus.OK.toString(), data);
    }
}
