package com.yvonne.seckill.service.impl;

import com.yvonne.seckill.common.enums.OrderStatus;
import com.yvonne.seckill.common.util.SnowFlake;
import com.yvonne.seckill.dao.KillItemMapper;
import com.yvonne.seckill.dao.KillOrderMapper;
import com.yvonne.seckill.pojo.KillItem;
import com.yvonne.seckill.pojo.KillOrder;
import com.yvonne.seckill.service.IKillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 执行秒杀
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class KillService implements IKillService {

    @Autowired
    private KillOrderMapper killOrderMapper;

    @Autowired
    private KillItemMapper killItemMapper;

    @Override
    public Boolean killItem(Integer userId, Integer killId) throws Exception {
        //1.判断当前用户是否已经抢购过当前商品
        if (killOrderMapper.selectKilledById(userId,killId) > 0){
            throw new Exception("您已抢购该商品,不可重复抢购");
        }
        else{
            //2.判断商品是否已售罄
            KillItem item = killItemMapper.selectByPrimaryKey(killId);
            if (item != null && item.getCanKill() == true){
                //3.扣减商品库存
                killItemMapper.updateKilledItem(killId);
                //4.创建订单
                KillOrder killOrder = new KillOrder();
                SnowFlake snowFlake = new SnowFlake(2, 3);
                killOrder.setCode(String.valueOf(snowFlake.nextId()));
                killOrder.setKillId(killId);
                killOrder.setUserId(userId);
                killOrder.setItemId(item.getItemId());
                killOrder.setStatus(OrderStatus.NOTPAYED.getCode());
                killOrder.setCreateTime(new Date());
                int res = killOrderMapper.insert(killOrder);
                //5.秒杀成功,发送邮件
                if (res > 0){

                }


            }
            else throw new Exception("商品已秒杀完,秒杀失败");
        }
        return true;
    }


}
