package com.imooc.pojo.vo;

import lombok.*;

/**
 * @author :Administrator
 * @path :CommentLevelCountsVO
 * @date :2023-07-09 10:44:51
 * @describe :class 用于展示上平评价数量的VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentLevelCountsVO {
    private Integer totalCounts;
    private Integer goodCounts;
    private Integer normalCounts;
    private Integer badCounts;
}
