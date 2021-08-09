package com.yvonne.seckill.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class KillOrder implements Serializable {
    private Integer id;

    private Integer killId;

    private Integer itemId;

    private Integer userId;

    private Integer status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

}