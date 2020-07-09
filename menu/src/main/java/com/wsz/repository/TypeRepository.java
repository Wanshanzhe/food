package com.wsz.repository;

import com.wsz.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author by 完善者
 * @date 2020/7/6 14:44
 * @DESC
 */
@Repository
public interface TypeRepository {
    public Type findById(long id);
    public List<Type> findAll();
}
