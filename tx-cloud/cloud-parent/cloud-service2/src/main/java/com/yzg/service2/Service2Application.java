package com.yzg.service2;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

/**
 * @ClassName Service2Application
 * @Description TODO
 * @Authoe weiyan
 * @Date 2019/12/4 11:35
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@EnableDistributedTransaction
public class Service2Application {

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class,args);
    }

    /**
             * 监听器：监听HTTP请求事件
     * 解决RequestContextHolder.getRequestAttributes()空指针问题
     * @return
             */
    @Bean
    public RequestContextListener requestContextListener(){
        return new RequestContextListener();
    }
}