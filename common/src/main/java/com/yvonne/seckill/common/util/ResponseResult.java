package com.yvonne.seckill.common.util;

import com.yvonne.seckill.common.enums.StatusCode;

/**
 * Description：<描述>
 */
public class ResponseResult {

    private Integer code;
    private String msg;
    private Object data;

    public ResponseResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult(StatusCode statusCode) {
        code = statusCode.getCode();
        msg = statusCode.getMsg();
    }

    public ResponseResult(StatusCode statusCode,String msg) {
        code = statusCode.getCode();
        this.msg = msg;
    }

}
