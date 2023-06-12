package com.imooc.config;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author :Administrator
 * @path :CorsConfig
 * @date :2023-06-12 22:06:46
 * @describe :class
 */
@Configuration
@NoArgsConstructor
public class CorsConfig {

    /**
     * 解决跨域问题
     *
     * @return -
     */
    @Bean
    public CorsFilter corsFilter() {
        // 1 添加cors配置信息
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("http://localhost:8080");
        // 设置是否发送cookie信息
        config.setAllowCredentials(true);
        // 设置允许请求的方式
        config.addAllowedMethod("*");
        // 设置允许的header
        config.addAllowedHeader("*");

        // 2 为url添加映射路径
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        // 3 返回重新定义好的source
        return new CorsFilter(source);
    }
}
