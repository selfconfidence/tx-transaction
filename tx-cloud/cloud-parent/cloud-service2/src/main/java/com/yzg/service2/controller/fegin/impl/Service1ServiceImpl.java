package com.yzg.service2.controller.fegin.impl;

import com.codingapi.txlcn.tc.support.DTXUserControls;
import com.codingapi.txlcn.tracing.TracingContext;
import com.yzg.service2.controller.fegin.Service1Service;
import com.yzg.service2.entity.Tdemo;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * @ClassName Service1ServiceImpl
 * @Description TODO
 * @Authoe weiyan
 * @Date 2019/12/4 11:44
 * @Version 1.0
 **/
@Component
public class Service1ServiceImpl implements Service1Service {

    /**
     * 服务熔断
     * @return
     */

    @Override
    public String service1(Tdemo tdemo) {
        //
/*
        DTXUserControls.rollbackGroup(TracingContext.tracing().groupId());
*/
       throw new RuntimeException("服務熔斷");
    }
}