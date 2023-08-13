package com.imooc.enums;

/**
 * @author :Administrator
 * @path :OrderStatusEnum
 * @date :2023-08-13 13:28:20
 * @describe :enum 订单状态 枚举
 */
public enum OrderStatusEnum {
    /**
     * 1
     */
    WAIT_PAY(10, "代付款"),
    WAIT_DELIVER(20, "已付款，待发货"),
    WAIT_RECEIVE(30, "已发货，待收货"),
    SUCCESS(40, "交易成功"),
    CLOSE(50, "交易关闭");
    public final Integer type;
    public final String value;

    OrderStatusEnum(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
