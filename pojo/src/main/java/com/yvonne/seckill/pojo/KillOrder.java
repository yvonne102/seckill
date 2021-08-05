package com.yvonne.seckill.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class KillOrder {
    private Integer id;

    private Integer killId;

    private Integer itemId;

    private Integer userId;

    private Integer status;

    private Date createTime;

}