package com.imooc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author :Administrator
 * @path :YesOrNO
 * @date :2023-06-25 20:25:02
 * @describe :enum 是否 枚举
 */
@AllArgsConstructor
@Getter
public enum YesOrNO {

    /**
     * woman
     */
    NO(0, "否"),
    YES(1, "是");
    public final Integer type;
    public final String value;

}
