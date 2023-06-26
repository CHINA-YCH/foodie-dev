package com.imooc.service.impl;

import com.imooc.enums.Sex;
import com.imooc.mapper.UsersMapper;
import com.imooc.pojo.Users;
import com.imooc.pojo.bo.UserBO;
import com.imooc.service.UserService;
import com.imooc.utils.DateUtil;
import com.imooc.utils.MD5Utils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;

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

    @Autowired
    private Sid sid;

    public static final String USER_FACE = "\"C:\\Users\\Administrator\\Desktop\\desk\\wallhaven-9d8x9d.png\"";

    @Transactional(propagation = Propagation.SUPPORTS, rollbackFor = RuntimeException.class)
    @Override
    public boolean queryUsernameIsExist(String username) {
        Example userExample = new Example(Users.class);
        Example.Criteria userCriteria = userExample.createCriteria();
        userCriteria.andEqualTo("username", username);
        Users result = userMapper.selectOneByExample(userExample);

        return result != null;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = RuntimeException.class)
    @Override
    public Users createUser(UserBO userBO) {

        String userId = sid.nextShort();


        Users user = new Users();
        user.setId(userId);
        user.setUsername(userBO.getUsername());
        try {
            user.setPassword(MD5Utils.getMD5Str(userBO.getPassword()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // 默认用户昵称同同户名
        user.setNickname(userBO.getUsername());
        // 默认头像
        user.setFace(USER_FACE);
        user.setBirthday(DateUtil.stringToDate("1900-01-01"));
        // 默认性别为 保密
        user.setSex(Sex.secret.type);
        user.setCreatedTime(new Date());
        user.setUpdatedTime(new Date());
        userMapper.insert(user);
        return user;
    }


    @Transactional(propagation = Propagation.SUPPORTS, rollbackFor = RuntimeException.class)
    @Override
    public Users queryUserForLogin(String username, String password) {
        Example example = new Example(Users.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username", username);
        criteria.andEqualTo("password", password);
        return userMapper.selectOneByExample(example);
    }
}
