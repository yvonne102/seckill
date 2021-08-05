package com.yvonne.seckill.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Item {
    private Integer id;

    private String name;

    private String code;

    private Integer stock;

    private Boolean isActive;

    private Date createTime;

}