package com.imooc.service;

import com.imooc.pojo.bo.SubmitOrderBO;

/**
 * @author :Administrator
 * @path :CarouselService
 * @date :2023-06-25 19:58:14
 * @describe :interface
 */
public interface OrderService {

    /**
     * 用于创建订单
     * @param submitOrderBO
     */
    public void createOrder(SubmitOrderBO submitOrderBO);
}
