package com.team6.bms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.team6.bms.interceptor.ReaderInterceptor;
import com.team6.bms.interceptor.UserInterceptor;

@Configuration // 表明是配置类
public class InterceptorConfig implements WebMvcConfigurer {

        // 所有的页面和请求
        private static final String[] all = {
                        "/**/*.html",
                        "/bookInfo/**",
                        "/bookType/**",
                        "/borrow/**",
                        "/update/**",
                        "/user/**"
        };

        // 与登录和注册相关的界面和请求
        public static final String[] aboutLogin = {
                        "/",
                        "/index.html",
                        "/register.html",
                        "/user/login",
                        "/user/register"
        };

        // 与读者相关的页面和请求
        public static final String[] aboutReader = {
                        "/reader/**/*.html", // 读者页面
                        "/*/reader/**", // 读者请求
        };

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
                // 未实现的拦截器
                // 不会
        }
}
