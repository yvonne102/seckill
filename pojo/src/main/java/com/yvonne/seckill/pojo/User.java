package com.yvonne.seckill.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;

    private String userName;

    private String password;

    private String phone;

    private String email;

    private Integer roleId;

    private Date createTime;


}