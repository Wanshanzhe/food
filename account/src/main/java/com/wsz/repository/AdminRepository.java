package com.wsz.repository;

import com.wsz.entity.Admin;
import org.springframework.stereotype.Repository;

/**
 * @author by 完善者
 * @date 2020/7/7 21:39
 * @DESC
 */
@Repository
public interface AdminRepository {
    public Admin login(String username,String password);
}
