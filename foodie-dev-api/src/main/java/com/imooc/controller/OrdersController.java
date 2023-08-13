package com.imooc.controller;

import com.imooc.enums.PayMethod;
import com.imooc.pojo.bo.SubmitOrderBO;
import com.imooc.service.OrderService;
import com.imooc.utils.CookieUtils;
import com.imooc.utils.IMOOCJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author :Administrator
 * @path :HelloController
 * @date :2023-06-11 14:14:38
 * @describe :class
 */
@Api(value = "订单相关", tags = {"订单相关的api接口"})
@RestController
@RequestMapping(value = {"orders"})
public class OrdersController extends BaseController {

    @Autowired
    private OrderService orderService;


    @ApiOperation(value = "用户下单 ", notes = "用户下单.", httpMethod = "POST")
    @PostMapping(value = "/create")
    public IMOOCJSONResult create(@RequestBody SubmitOrderBO submitOrderBO,
                                  HttpServletRequest request,
                                  HttpServletResponse response
    ) {
        if (!submitOrderBO.getPayMethod().equals(PayMethod.WEIXIN.type) &&
                !submitOrderBO.getPayMethod().equals(PayMethod.ALIPAY.type)) {
            return IMOOCJSONResult.errorMsg("支付方式不支持");
        }


        System.out.println(submitOrderBO);
        // 1 创建订单
        String orderId = orderService.createOrder(submitOrderBO);
        // 2 创建订单以后，移除购物车中已结算（已提交）的商品

        // TODO 整合redis之后，完善购物车中的已结算商品清楚，并且同步到前端的cookie

        CookieUtils.setCookie(request, response, FOODIE_SHOPCART, "", true);
        // 3 向支付重新发送当前订单，用于保存支付中心的订单

        return IMOOCJSONResult.ok(orderId);
    }


}
