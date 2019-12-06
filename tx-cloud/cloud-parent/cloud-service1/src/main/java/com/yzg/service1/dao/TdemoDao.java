package com.yzg.service1.dao;

import com.yzg.service1.entity.Tdemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @ClassName TdemoDao
 * @Description TODO
 * @Authoe weiyan
 * @Date 2019/12/5 10:52
 * @Version 1.0
 **/
public interface TdemoDao extends JpaRepository<Tdemo,Long>, JpaSpecificationExecutor<Tdemo> {
}
