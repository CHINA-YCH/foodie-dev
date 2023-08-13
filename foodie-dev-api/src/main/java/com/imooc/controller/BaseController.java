package com.imooc.controller;

import org.springframework.stereotype.Controller;

/**
 * @author :Administrator
 * @path :BaseController
 * @date :2023-07-09 11:49:51
 * @describe :class
 */
@Controller
public class BaseController {
    public static final String FOODIE_SHOPCART = "shopcart";
    public static final Integer COMMENT_PAGE_SIZE = 10;
    public static final Integer PAGE_SIZE = 20;

    // 支付中心调用地址
    String paymentUrl = "http://payment.t.mukewang.com/foodie-payment/payment/createMerchanOrder";
    /**
     * 微信支付成功 -> 支付中心 -> 天天吃货平台  回调通知的url
     */
//    String payReturnUrl = "http://localhost:8088/orders/notifyMerchanOrderPaid";
    String payReturnUrl = "http://4rhura.natappfree.cc/orders/notifyMerchanOrderPaid";
}
