package com.imooc.pojo.bo;

import lombok.*;

/**
 * @author :Administrator
 * @path :UserBO
 * @date :2023-06-11 21:48:37
 * @describe :class
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class UserBO {
    private String username;
    private String password;
    private String confirmPassword;

}
