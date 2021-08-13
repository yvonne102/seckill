package com.yvonne.seckill.dao;

import com.yvonne.seckill.pojo.Item;
import com.yvonne.seckill.pojo.KillItem;

import java.util.List;

public interface KillItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KillItem record);

    int insertSelective(KillItem record);

    KillItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KillItem record);

    int updateByPrimaryKey(KillItem record);

    List<KillItem> selectAll();

    int updateKilledItem(int killId);
}