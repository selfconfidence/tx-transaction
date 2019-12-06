package com.yzg.service1;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName Service1Application
 * @Description TODO
 * @Authoe weiyan
 * @Date 2019/12/4 11:34
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //发现服务
@EnableDistributedTransaction
public class Service1Application {

    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class,args);
    }

}