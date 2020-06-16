package com.xr.util;


import java.util.HashMap;
import java.util.Map;
/**
 * 返回给前台的对象
 */
public class ResponseResult {
    private Integer code = 20000;//返回给前端的状态码，20000表示成功
    private Map<String,Object> data = new HashMap<>();
    private String message = "默认的错误信息";

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
