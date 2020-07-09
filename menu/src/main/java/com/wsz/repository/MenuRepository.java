package com.wsz.repository;

import com.wsz.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author by 完善者
 * @date 2020/6/30 21:21
 * @DESC
 */
@Repository
public interface MenuRepository {
    public List<Menu> findAll(int page,int limit);
    public int count();
    public Menu findById(long id);
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(long id);
}
