package com.wsz.entity;

import lombok.Data;

/**
 * @author by 完善者
 * @date 2020/6/30 21:18
 * @DESC
 */
@Data
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
