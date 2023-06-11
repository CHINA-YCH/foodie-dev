package com.imooc.service;

import com.imooc.pojo.Stu;

/**
 * @author :Administrator
 * @path :StuService
 * @date :2023-06-11 17:27:07
 * @describe :interface
 */
public interface UserService {

    /**
     * 判断用户名是否存在
     *
     * @param username -
     * @return -
     */
    public boolean queryUsernameIsExist(String username);
}
