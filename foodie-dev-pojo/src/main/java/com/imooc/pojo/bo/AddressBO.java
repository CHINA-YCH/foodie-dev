package com.imooc.pojo.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author :Administrator
 * @path :AddressBO
 * @date :2023-08-13 11:14:51
 * @describe :class 用户新增或修改地址的BO
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AddressBO {
    private String addressId;
    private String userId;
    private String receiver;
    public String mobile;
    private String province;
    private String city;
    private String district;
    private String detail;
}
