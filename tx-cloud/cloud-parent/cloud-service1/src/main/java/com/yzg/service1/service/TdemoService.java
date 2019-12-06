package com.yzg.service1.service;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.codingapi.txlcn.tracing.TracingContext;
import com.yzg.service1.dao.TdemoDao;
import com.yzg.service1.entity.Tdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @ClassName TdemoService
 * @Description TODO
 * @Authoe weiyan
 * @Date 2019/12/5 10:53
 * @Version 1.0
 **/
@Service
public class TdemoService {

    @Autowired
    private TdemoDao tdemoDao;

    @TxcTransaction(propagation = DTXPropagation.SUPPORTS) //分佈式事務
    @Transactional
    public void save(Tdemo tdemo){
        Tdemo demo = new Tdemo();
        demo.setId(UUID.randomUUID().toString());
/*
        demo.setId(((Double)Math.random()).longValue());
*/
        demo.setGroupId(TracingContext.tracing().groupId());
/*        int i = 1 /0;*/
        tdemoDao.save(demo);
    }

}