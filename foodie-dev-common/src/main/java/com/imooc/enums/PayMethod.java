package com.imooc.enums;

/**
 * @author :Administrator
 * @path :PayMethod
 * @date :2023-08-13 12:47:52
 * @describe :enum 支付方式 枚举
 */
public enum PayMethod {
    /**
     * 1
     */
    WEIXIN(1, "微信"),
    ALIPAY(2, "支付宝");


    public final Integer type;
    public final String value;

    PayMethod(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
