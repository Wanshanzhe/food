package com.wsz.repository;

import com.wsz.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author by 完善者
 * @date 2020/7/8 15:23
 * @DESC
 */
@Repository
public interface OrderRepository {
    public void save(Order order);
    public List<Order> findAllByUId(int page,int limit,long uid);
    public int countByUid(long uid);
    public void deleteByUid(long uid);
    public void deleteByMid(long mid);
    public int count();
    public List<Order> findAll(int index,int limit);
    public void updateState(long id);
}
