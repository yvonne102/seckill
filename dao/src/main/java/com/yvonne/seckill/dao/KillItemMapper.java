package com.yvonne.seckill.dao;

import com.yvonne.seckill.pojo.KillItem;

public interface KillItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KillItem record);

    int insertSelective(KillItem record);

    KillItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KillItem record);

    int updateByPrimaryKey(KillItem record);
}