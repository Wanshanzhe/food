package com.wsz.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author by 完善者
 * @date 2020/7/7 16:21
 * @DESC
 */
@Data
public class User {
    private long id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;
}
