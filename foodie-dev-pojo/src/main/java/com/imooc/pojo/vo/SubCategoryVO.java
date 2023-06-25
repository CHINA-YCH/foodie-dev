package com.imooc.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :Administrator
 * @path :SubCategoryVO
 * @date :2023-06-25 21:25:31
 * @describe :class 三级分类VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubCategoryVO {
    private Integer subId;
    private String subName;
    private String subType;
    private Integer subFatherId;

}
