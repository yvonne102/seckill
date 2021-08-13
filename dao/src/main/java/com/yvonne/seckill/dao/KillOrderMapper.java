package com.yvonne.seckill.dao;

import com.yvonne.seckill.pojo.KillOrder;
import org.apache.ibatis.annotations.Param;

public interface KillOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KillOrder record);

    int insertSelective(KillOrder record);

    KillOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KillOrder record);

    int updateByPrimaryKey(KillOrder record);

    int selectKilledById(@Param("userId")int userId,@Param("killId") int killId);
}