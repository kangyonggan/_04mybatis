package com.kangyonggan.demo.mapper;

import com.kangyonggan.demo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author kangyonggan
 * @since 2019-09-23
 */
public interface UserMapper {

    /**
     * 根据账号查找用户信息
     *
     * @param account
     * @return
     */
    User selectUserByAccount(@Param("account") String account);

}
