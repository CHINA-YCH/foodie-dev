package com.imooc.pojo.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author :Administrator
 * @path :SubmitOrderBO
 * @date :2023-08-13 12:14:26
 * @describe :class 用于创建订单的bo
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SubmitOrderBO {

    private String userId;
    private String itemSpecIds;
    private String addressId;
    private Integer payMethod;
    private String leftMsg;
}
