package com.daniel.study.springbootmybatis.vo;

import java.io.Serializable;

/**
 * @author：况(Yooluo)
 * @date：2018/1/25 10:10
 * @description：JSON公共实体
 */

public class JsonVO<T> implements Serializable {
    private Integer code;

    private String message;

    private T data;

    public JsonVO() {
    }

    public JsonVO(int code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public JsonVO(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "JsonVO{" + "code=" + code + ", message='" + message + '\'' + ", data=" + data + '}';
    }
}
