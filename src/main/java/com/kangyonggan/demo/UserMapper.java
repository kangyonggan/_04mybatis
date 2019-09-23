package com.kangyonggan.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author kangyonggan
 * @since 2019-09-23
 */
@Mapper
public interface UserMapper {

    /**
     * 根据账号查找用户信息
     *
     * @param account
     * @return
     */
    User selectUserByAccount(@Param("account") String account);

}
