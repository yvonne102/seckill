package com.yvonne.seckill.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class KillItem {
    private Integer id;

    private Integer itemId;

    private Integer total;

    private Date startTime;

    private Date endTime;

    private Boolean isAvtive;

}