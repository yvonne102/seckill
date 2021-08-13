package com.yvonne.seckill.front_web.controller;

import com.yvonne.seckill.common.enums.StatusCode;
import com.yvonne.seckill.common.util.ResponseResult;
import com.yvonne.seckill.front_web.dto.KillDto;
import com.yvonne.seckill.service.impl.KillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Description：<描述>
 */
@Controller
@RequestMapping("/kill")
public class KillController {

    @Autowired
    private KillService killService;

    @RequestMapping("/execute")
    @ResponseBody
    public ResponseResult execute(@RequestBody@Validated KillDto killDto, BindingResult bindingResult, HttpSession session){
        //1.判断参数是否合法
        if (bindingResult.hasErrors() || killDto.getUserId() <= 0){
            return new ResponseResult(StatusCode.FAIL);
        }
        //2.判断用户是否登录
        //Object uid = session.getAttribute("uid");
        //if (uid == null){
        //    return new ResponseResult(StatusCode.NOUSERLOIGN);
        //}
        //Integer userId= (Integer)uid ;
        //3.秒杀业务
        try {
            killService.killItem(killDto.getUserId(),killDto.getKillId());
        } catch (Exception e) {
            return new ResponseResult(StatusCode.FAIL,e.getMessage());
        }

        return new ResponseResult(StatusCode.SUCCESS);
    }
}
