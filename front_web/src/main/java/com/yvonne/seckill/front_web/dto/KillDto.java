package com.yvonne.seckill.front_web.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Description：<描述>
 */
@Data
public class KillDto implements Serializable {

    @NotNull
    private Integer killId;

    @NotNull
    private Integer userId;

}
