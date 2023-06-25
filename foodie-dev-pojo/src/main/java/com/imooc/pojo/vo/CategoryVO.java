package com.imooc.pojo.vo;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author :Administrator
 * @path :CategoryVO
 * @date :2023-06-25 21:23:10
 * @describe :class 二级分类VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryVO {
    private Integer id;
    private String name;
    private String type;
    private Integer fatherId;

    /**
     * 三级分类VO list
     */
    private List<SubCategoryVO> subCatList;

}
