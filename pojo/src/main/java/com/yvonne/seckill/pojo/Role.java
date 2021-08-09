package com.yvonne.seckill.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable {
    private Integer id;

    private String role;

}