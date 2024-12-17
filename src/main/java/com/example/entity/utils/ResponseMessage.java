package com.example.entity.utils;

import org.springframework.http.HttpStatus;

/**
 * 统一回复前端的数据格式，方便交互。
 * @param <T>   传输的data类型
 */
public class ResponseMessage<T> {
    private T data;//数据
    private Integer code;//状态码
    private String message;//消息

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseMessage(Integer code, String message, T data){
        this.code=code;
        this.message=message;
        this.data=data;
    }
    public static <K> ResponseMessage<K> success(K data){
        return new ResponseMessage<>(HttpStatus.OK.value(),"success!",data);
    }
    public static <K> ResponseMessage<K> fail(){
        //所有异常统一规定code为500，具体是什么异常，可查看日志！
        return new ResponseMessage<>(500,"error",null);
    }
}
