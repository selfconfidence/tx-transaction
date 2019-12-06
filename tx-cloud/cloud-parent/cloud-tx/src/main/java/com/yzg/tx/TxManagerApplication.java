package com.yzg.tx;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName TxManagerApplication
 * @Description TODO
 * @Authoe weiyan
 * @Date 2019/12/4 16:19
 * @Version 1.0
 **/
@SpringBootApplication
@EnableTransactionManagerServer
@EnableEurekaClient
public class TxManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TxManagerApplication.class,args);
    }

}