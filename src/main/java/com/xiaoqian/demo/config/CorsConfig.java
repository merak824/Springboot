package com.xiaoqian.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Cors解决跨域问题
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedHeaders("*") //匹配了所有的url
                .allowedOriginPatterns("*") //允许跨域请求包含任意的头信息
                .allowCredentials(true) //允许记录Cookie
                .allowedMethods("*"); //设置允许跨域的方法
    }
}
