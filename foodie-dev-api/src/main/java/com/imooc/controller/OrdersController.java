package com.imooc.controller;

import com.imooc.pojo.bo.SubmitOrderBO;
import com.imooc.utils.IMOOCJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Administrator
 * @path :HelloController
 * @date :2023-06-11 14:14:38
 * @describe :class
 */
@Api(value = "订单相关", tags = {"订单相关的api接口"})
@RestController
@RequestMapping(value = {"orders"})
public class OrdersController {
    @ApiOperation(value = "用户下单 ", notes = "用户下单.", httpMethod = "POST")
    @PostMapping(value = "/create")
    public IMOOCJSONResult create(
            @RequestBody SubmitOrderBO submitOrderBO) {
        System.out.println(submitOrderBO.toString());
        // 1 创建订单
        // 2 创建订单以后，移除购物车中已结算（已提交）的商品
        // 3 向支付重新发送当前订单，用于保存支付中心的订单
        return IMOOCJSONResult.ok();
    }
}
