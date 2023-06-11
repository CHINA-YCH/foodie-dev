package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author :Administrator
 * @path :Application
 * @date :2023-06-11 14:13:14
 * @describe :class
 * MapperScan(basePackages = "com.imooc.mapper") // 扫描 mybatis 通用 mapper 所在的包
 * ComponentScan(basePackages = {"com.imooc", "org.n3r.idworker"}) // 扫描所由包以及相关组件包
 * EnableTransactionManagement
 */
@SpringBootApplication
@MapperScan(basePackages = "com.imooc.mapper")
@ComponentScan(basePackages = {"com.imooc", "org.n3r.idworker"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
