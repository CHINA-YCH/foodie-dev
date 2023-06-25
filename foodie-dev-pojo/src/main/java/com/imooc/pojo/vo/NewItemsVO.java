package com.imooc.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author :Administrator
 * @path :CategoryVO
 * @date :2023-06-25 21:23:10
 * @describe :class 最新商品VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewItemsVO {

    private Integer rootCatId;
    private String rootCatName;
    private String slogan;
    private String catImage;
    private String bgColor;
    private List<SimpleItemVO> simpleItemList;

}
