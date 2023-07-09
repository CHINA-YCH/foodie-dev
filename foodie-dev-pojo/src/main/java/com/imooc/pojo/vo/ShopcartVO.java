package com.imooc.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author :Administrator
 * @path :ShopcartBO
 * @date :2023-07-09 14:13:59
 * @describe :class
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ShopcartVO {
    private String itemId;
    private String itemImgUrl;
    private String itemName;
    private String specId;
    private String specName;
    private String priceDiscount;
    private String priceDDiscount;
    private String priceNormal;
}
