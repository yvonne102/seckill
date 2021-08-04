package com.yvonne.seckill.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String userName;

    private String password;

    private String email;

    private String phone;

    private Integer isActive;

    private Integer roleId;

    private Date createTime;


}