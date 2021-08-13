package com.yvonne.seckill.service;

import com.yvonne.seckill.pojo.KillItem;

import java.util.List;

/**
 * Description：<描述>
 */
public interface KillItemService {

    List<KillItem> findAll();

    KillItem findDetail(Integer id);

}
