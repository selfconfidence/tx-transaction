package com.yzg.service2.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.util.Enumeration;

/**
 * @ClassName GlaConfig
 * @Description TODO
 * @Authoe weiyan
 * @Date 2019/12/4 11:54
 * @Version 1.0
 **/
/*
@Configuration
*/
public class GlaConfig {

    @Bean
    public RequestInterceptor requestInterceptor(){

        return (requestTemplate -> {
            //拿到所有第一次请求头信息
            ServletRequestAttributes servletRequestAttributes =  (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = servletRequestAttributes.getRequest();
            Enumeration<String> headerNames = request.getHeaderNames();
            while (headerNames.hasMoreElements()) {
                requestTemplate.header(headerNames.nextElement(),request.getHeader(headerNames.nextElement()));
                System.out.println(headerNames.nextElement()+"2222"+headerNames.nextElement());
            }
        });
    }

}