package com.wsz.controller;

import com.wsz.entity.Menu;
import com.wsz.feign.MenuFeign;
import com.wsz.feign.OrderFeign;
import com.wsz.vo.MenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author by 完善者
 * @date 2020/7/1 14:39
 * @DESC
 */
@Controller
@RequestMapping("/menu")
public class MenuHandler {

    @Autowired
    private MenuFeign menuFeign;

    @Autowired
    private OrderFeign orderFeign;

    @GetMapping("/findAll")
    @ResponseBody
    public MenuVO findAll(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit){
        int index = (page-1)*limit;
        return menuFeign.findAll(index, limit);
    }

    @GetMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location){
        return location;
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        orderFeign.deleteByMid(id);
        menuFeign.deleteById(id);
        return "redirect:/menu/redirect/menu_manage";
    }

    @GetMapping("/findTypes")
    public ModelAndView findTypes(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("menu_add");
        mv.addObject("list",menuFeign.findTypes());
        return mv;
    }

    @PostMapping("/save")
    public String save(Menu menu){
        menuFeign.save(menu);
        return "redirect:/menu/redirect/menu_manage";
    }

    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id")long id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("menu_update");
        mv.addObject("menu",menuFeign.findById(id));
        mv.addObject("list",menuFeign.findTypes());
        return mv;
    }

    @PostMapping("/update")
    public String update(Menu menu){
        menuFeign.update(menu);
        return "redirect:/menu/redirect/menu_manage";
    }
}
