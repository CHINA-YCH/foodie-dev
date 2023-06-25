package com.imooc.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :Administrator
 * @path :SimpleItemVO
 * @date :2023-06-25 22:12:46
 * @describe :class 6个最新商品的简单数据类型
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleItemVO {
    private String itemId;
    private String itemName;
    private String itemUrl;
    private String createdTime;
}
