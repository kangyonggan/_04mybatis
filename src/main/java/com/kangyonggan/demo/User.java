package com.kangyonggan.demo;

import lombok.Data;

import java.util.Date;

/**
 * @author kangyonggan
 * @since 2019-09-20
 */
@Data
public class User {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码盐
     */
    private String salt;

    /**
     * 逻辑删除
     */
    private Byte isDeleted;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date updatedTime;

}
