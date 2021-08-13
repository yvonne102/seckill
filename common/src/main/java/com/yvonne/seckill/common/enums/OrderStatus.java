package com.yvonne.seckill.common.enums;

/**
 * Description：<描述>
 */
public enum OrderStatus {

    INVALID(-1,"无效"),
    NOTPAYED(0,"成功-未付款"),
    PAYED(1,"已付款"),
    CANCEL(2,"已取消");

    private Integer code;
    private String msg;

    OrderStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
