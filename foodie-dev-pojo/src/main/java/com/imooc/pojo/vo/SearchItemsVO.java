package com.imooc.pojo.vo;

import lombok.Data;

/**
 * @author :Administrator
 * @path :SearchItemsVO
 * @date :2023-07-09 13:10:48
 * @describe :class 用于展示商品搜索结果
 */
@Data
public class SearchItemsVO {
    private String itemId;
    private String itemName;
    private Integer sellCounts;
    private String imgUrl;
    private Integer price;
}
