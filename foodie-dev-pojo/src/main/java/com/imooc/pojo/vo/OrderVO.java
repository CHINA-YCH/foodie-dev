package com.imooc.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderVO {

    private String orderId;
    private MerchantOrdersVO merchantOrdersVO;
}