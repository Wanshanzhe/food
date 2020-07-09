package com.wsz.vo;

import com.wsz.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author by 完善者
 * @date 2020/7/1 21:35
 * @DESC
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
    private int code;
    private String msg;
    private int count;
    private List<User> data;
}
