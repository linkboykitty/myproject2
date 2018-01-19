package com.linkboy.myproject.modules.user.test;

import com.linkboy.myproject.modules.sys.entity.SysUser;
import com.linkboy.myproject.modules.sys.mapper.SysUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>Title: TbUserMapperTest</p>
 * <p>Description: </p>
 *
 * @author Linkboy
 * @version 1.0.0
 * @date 2018/1/17 17:44
 */

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"classpath:spring-context.xml"})
public class TbUserMapperTest {
    @Autowired
    private SysUserMapper userMapper;

    @Test
    public void testInesrt(){
        SysUser sysUser =new SysUser();
        sysUser.setId("123");
        sysUser.setLoginIp("109");
        sysUser.setLoginName("小明");
        userMapper.insert(sysUser);
    }

}
