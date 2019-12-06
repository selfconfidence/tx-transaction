package com.yzg.service2.controller.fegin;

import com.yzg.service2.controller.fegin.impl.Service1ServiceImpl;
import com.yzg.service2.entity.Tdemo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName Service1Service
 * @Description TODO
 * @Authoe weiyan
 * @Date 2019/12/4 11:41
 * @Version 1.0
 **/
@FeignClient(value = "eureka-service1"/*,fallback = Service1ServiceImpl.class*/)
public interface Service1Service {

    @RequestMapping(value = "service1",method = RequestMethod.POST)
    String service1(@RequestBody Tdemo tdemo);
}