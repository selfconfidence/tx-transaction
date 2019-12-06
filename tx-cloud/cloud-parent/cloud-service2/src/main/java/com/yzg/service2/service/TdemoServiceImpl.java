package com.yzg.service2.service;

import com.codingapi.txlcn.common.util.Transactions;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tracing.TracingContext;
import com.yzg.service2.controller.fegin.Service1Service;
import com.yzg.service2.dao.TdemoDao;
import com.yzg.service2.entity.Tdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Objects;

/**
 * @ClassName TdemoService
 * @Description TODO
 * @Authoe weiyan
 * @Date 2019/12/5 10:53
 * @Version 1.0
 **/
@Service
public class TdemoServiceImpl implements TdemoService {

    @Autowired
    private TdemoDao tdemoDao;

    @Autowired
    private Service1Service service1Service;

    @LcnTransaction //分佈式事務
    @Transactional
    @Override
    public String save(String exFlag){
        String result = "FAIL";
        try {
            TracingContext tracing = TracingContext.tracing();
            Tdemo tdemo = new Tdemo();
/*
            tdemo.setId(UUID.randomUUID().toString());
*/
            String applicationId = Transactions.getApplicationId();
            System.out.println(applicationId);
            tdemo.setAppName(applicationId);
            tdemo.setCreateTime(new Date());
/*
            String groupId = TracingContext.tracing().groupId();
*/
/*
            System.out.println(groupId);
*/
            tdemo.setGroupId(applicationId);
            tdemo.setDemoField("field");
            tdemoDao.save(tdemo);
            result =  service1Service.service1(tdemo);
          /*  String s = null;
            s.split(",");*/
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
        // 置异常标志，DTX 回滚
        if (Objects.nonNull(exFlag)) {
            throw new IllegalStateException("by exFlag");
        }
        return result;
    }

}