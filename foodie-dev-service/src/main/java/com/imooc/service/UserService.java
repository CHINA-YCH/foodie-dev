package com.imooc.service;

import com.imooc.pojo.Stu;
import com.imooc.pojo.Users;
import com.imooc.pojo.bo.UserBO;
import org.springframework.stereotype.Service;

/**
 * @author :Administrator
 * @path :StuService
 * @date :2023-06-11 17:27:07
 * @describe :interface
 */
@Service
public interface UserService {

    /**
     * 判断用户名是否存在
     *
     * @param username -
     * @return -
     */
    public boolean queryUsernameIsExist(String username);


    /**
     * 创建用户
     *
     * @param userBO 前端传过来的参数
     * @return -
     */
    public Users createUser(UserBO userBO);
}
