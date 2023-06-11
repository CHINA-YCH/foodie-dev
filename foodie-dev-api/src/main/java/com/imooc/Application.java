package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author :Administrator
 * @path :Application
 * @date :2023-06-11 14:13:14
 * @describe :class
 */
@SpringBootApplication
@MapperScan(basePackages = "com.imooc.mapper") // 扫描 mybatis 通用 mapper 所在的包
@EnableTransactionManagement
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
