package com.yvonne.seckill.front_web.controller;

import com.yvonne.seckill.pojo.KillItem;
import com.yvonne.seckill.service.KillItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Description：<描述>
 */
@Controller
@RequestMapping("/killItem")
public class KillItemController {

    @Autowired
    private KillItemService killItemService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<KillItem> list = killItemService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/detail")
    public String detail(Integer id,Model model){
        if (id == null || id <=0){
            return "error";
        }
        KillItem detail = killItemService.findDetail(id);
        model.addAttribute("detail",detail);
        return "info";
    }

}
