package com.wsz.vo;

import com.wsz.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author by 完善者
 * @date 2020/7/8 18:01
 * @DESC
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderVO {
    private int code;
    private String msg;
    private int count;
    private List<Order> data;
}
