package com.yzg.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName FeginApplication
 * @Description TODO
 * @Authoe weiyan
 * @Date 2019/12/4 11:14
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class FeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeginApplication.class,args);
    }

}