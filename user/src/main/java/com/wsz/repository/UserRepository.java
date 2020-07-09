package com.wsz.repository;

import com.wsz.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author by 完善者
 * @date 2020/7/7 16:24
 * @DESC
 */
@Repository
public interface UserRepository {
    public List<User> findAll(int page,int limit);
    public User findById(long id);
    public int count();
    public void save(User user);
    public void update(User user);
    public void deleteById(long id);

}
