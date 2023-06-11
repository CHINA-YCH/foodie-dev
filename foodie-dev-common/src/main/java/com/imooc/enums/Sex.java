package com.imooc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author :Administrator
 * @path :Sex
 * @date :2023-06-11 22:03:53
 * @describe :enum
 */
@AllArgsConstructor
@Getter
public enum Sex {
    woman(0, "女"),
    man(1, "男"),
    secret(2, "保密");
    public final Integer type;
    public final String value;

}
