package com.imooc.service;

import com.imooc.pojo.Users;
import com.imooc.pojo.bo.UserBO;

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
    boolean queryUsernameIsExist(String username);


    /**
     * 创建用户
     *
     * @param userBO 前端传过来的参数
     * @return -
     */
    Users createUser(UserBO userBO);

    /**
     * 检索用户名和密码是否匹配，用于等率
     *
     * @param username -
     * @param password -
     * @return -
     */
    Users queryUserForLogin(String username, String password);
}
