package com.imooc.service.impl;

import com.imooc.mapper.StuMapper;
import com.imooc.mapper.UsersMapper;
import com.imooc.pojo.Stu;
import com.imooc.pojo.Users;
import com.imooc.service.StuService;
import com.imooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

/**
 * @author :Administrator
 * @path :StuServiceImpl
 * @date :2023-06-11 17:28:56
 * @describe :class
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    public UsersMapper userMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryUsernameIsExist(String username) {
        Example userExample = new Example(Users.class);
        Example.Criteria userCriteria = userExample.createCriteria();

        userCriteria.andEqualTo("username", username);
        Users result = userMapper.selectOneByExample(userExample);

        return result == null ? false : true;
    }
}
