package com.imooc.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author :Administrator
 * @path :ItemCommentVO
 * @date :2023-07-09 11:19:03
 * @describe :class 用于展示商品评价的vo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemCommentVO {
    private Integer commentLevel;
    private String content;
    private String specName;
    private Date createdTime;
    private String userFace;
    private String nickname;
}
