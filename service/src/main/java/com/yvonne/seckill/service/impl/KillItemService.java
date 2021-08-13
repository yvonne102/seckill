package com.yvonne.seckill.service.impl;

import com.yvonne.seckill.dao.KillItemMapper;
import com.yvonne.seckill.pojo.KillItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Description：<描述>
 */
@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class KillItemService implements com.yvonne.seckill.service.KillItemService {

    @Autowired
    private KillItemMapper killItemMapper;

    @Override
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public List<KillItem> findAll() {
        return killItemMapper.selectAll();
    }

    @Override
    public KillItem findDetail(Integer id) {
        return killItemMapper.selectByPrimaryKey(id);
    }
}
