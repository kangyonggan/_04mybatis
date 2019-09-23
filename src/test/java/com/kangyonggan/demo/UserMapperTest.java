package com.kangyonggan.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kangyonggan
 * @since 2019-09-20
 */
public class UserMapperTest extends AbstractTest {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据账号查询
     */
    @Test
    public void testFindByAccount() {
        System.out.println(userMapper.selectUserByAccount("admin"));
    }

}
