package com.imooc.controller;

import com.imooc.service.StuService;
import com.imooc.service.UserService;
import com.imooc.utils.IMOOCJSONResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author :Administrator
 * @path :HelloController
 * @date :2023-06-11 14:14:38
 * @describe :class
 */
@RestController
@RequestMapping(value = "passport")
public class PassportController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/usernameIsExist")
    public IMOOCJSONResult usernameIsExists(@RequestParam String username) {

        // 1 判断用户名不能为空
        if (StringUtils.isBlank(username)) {
            return IMOOCJSONResult.errorMsg("用户名不能为空");
        }

        // 2 查找注册的用户名是否存在
        boolean isExist = userService.queryUsernameIsExist(username);
        if (isExist) {
            return IMOOCJSONResult.errorMsg("用户名已存在");
        }
        // 3 请求成功，用户名没要 重复
        return IMOOCJSONResult.ok();
    }


}
