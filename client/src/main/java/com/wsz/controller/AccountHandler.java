package com.wsz.controller;

import com.wsz.entity.Admin;
import com.wsz.entity.User;
import com.wsz.feign.AccountFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;

/**
 * @author by 完善者
 * @date 2020/7/7 22:06
 * @DESC
 */
@Controller
@RequestMapping("/account")
public class AccountHandler {

    @Autowired
    private AccountFeign accountFeign;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("type") String type, HttpSession session){
        Object object = accountFeign.login(username,password,type);
        LinkedHashMap<String,Object> hashMap = (LinkedHashMap<String, Object>) object;
        String result = null;
        if (StringUtils.isEmpty(object)){
            result = "login";
        }else{
           switch (type){
               case "user":
                    User user = new User();
                    String idStr1 = hashMap.get("id")+"";
                    long id1 = Long.parseLong(idStr1);
                    user.setId(id1);
                    user.setNickname((String)hashMap.get("nickname"));
                    session.setAttribute("user",user);
                    result = "index";
               break;
               case "admin":
                   Admin admin = new Admin();
                   String idStr2 = hashMap.get("id")+"";
                   long id2 = Long.parseLong(idStr2);
                   admin.setId(id2);
                   admin.setUsername((String)hashMap.get("username"));
                   admin.setPassword((String)hashMap.get("password"));
                   session.setAttribute("admin",admin);
                   result = "main";
                   break;
           }
        }
        return result;
    }

    @GetMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location){
        return location;
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login.html";
    }

}
