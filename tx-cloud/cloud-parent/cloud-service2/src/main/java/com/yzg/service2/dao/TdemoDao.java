package com.yzg.service2.dao;

import com.yzg.service2.entity.Tdemo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName TdemoDao
 * @Description TODO
 * @Authoe weiyan
 * @Date 2019/12/5 10:52
 * @Version 1.0
 **/
public interface TdemoDao extends JpaRepository<Tdemo,Long> {
    public Tdemo findById(String id);
}
