package com.imooc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author :Administrator
 * @path :YesOrNO
 * @date :2023-06-25 20:25:02
 * @describe :enum 商品评价等级
 */
@AllArgsConstructor
@Getter
public enum CommentLevel {

    /**
     * woman
     */
    GOOD(1, "好评"),
    NORMAL(2, "中评"),
    BAD(3, "差评");
    public final Integer type;
    public final String value;

}
