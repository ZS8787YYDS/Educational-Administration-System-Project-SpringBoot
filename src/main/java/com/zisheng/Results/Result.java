package com.zisheng.Results;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;
    public static <T> Result<T> success(T data,String msg)
    {
        Result<T> result = new Result<>();
        result.code = 1;
        result.msg = msg;
        result.data = data;
        return result;
    }
    public static <T> Result<T> success(T data)
    {
        Result<T> result = new Result<>();
        result.code = 1;
        result.data = data;
        return result;
    }
    public static <T> Result<T> failure(String msg){
        return new Result<>(0,msg,null);
    }
}
