package com.wsz.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author by 完善者
 * @date 2020/7/8 15:18
 * @DESC
 */
@Data
public class Order {
    private long id;
    private User user;
    private Menu menu;
    private Admin admin;
    private Date date;
    private int state;
}
