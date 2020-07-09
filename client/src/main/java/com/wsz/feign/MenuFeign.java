package com.wsz.feign;

import com.wsz.entity.Menu;
import com.wsz.entity.Type;
import com.wsz.vo.MenuVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author by 完善者
 * @date 2020/6/30 22:03
 * @DESC
 */
@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/menu/findAll/{page}/{limit}")
    public MenuVO findAll(@PathVariable("page") Integer page, @PathVariable("limit") Integer limit);


    @DeleteMapping("/menu/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);

    @GetMapping("/menu/findTypes")
    public List<Type> findTypes();

    @PostMapping("/menu/save")
    public void save(Menu menu);

    @GetMapping("/menu/findById/{id}")
    public Menu findById(@PathVariable("id")long id);

    @PutMapping("/menu/update")
    public void update(Menu menu);

}
