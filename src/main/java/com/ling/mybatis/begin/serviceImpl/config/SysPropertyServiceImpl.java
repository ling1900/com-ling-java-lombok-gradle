package com.ling.mybatis.begin.serviceImpl.config;

import com.ling.mybatis.begin.bean.common.DglgResponse;
import com.ling.mybatis.begin.bean.config.SysProperty;
import com.ling.mybatis.begin.bean.config.SysPropertyCreateRequest;
import com.ling.mybatis.begin.bean.config.SysPropertyQuery;
import com.ling.mybatis.begin.bean.config.SysPropertyUpdateRequest;
import com.ling.mybatis.begin.dao.DaoBase;
import com.ling.mybatis.begin.dao.config.SysPropertyDao;
import com.ling.mybatis.begin.dglgutil.ResCode;
import com.ling.mybatis.begin.service.config.SysPropertyService;
import com.ling.mybatis.begin.serviceImpl.ServiceImplBase2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Service
public class SysPropertyServiceImpl //
        extends ServiceImplBase2<SysProperty, SysPropertyQuery, SysPropertyUpdateRequest, SysPropertyDao> //
    implements SysPropertyService {
    @Autowired
    private SysPropertyDao sysPropertyDao;

    @Override
    protected DaoBase getDao() {
        return sysPropertyDao;
    }

    @Override
    protected int resCodeWhenCantFound() {
        return ResCode.CantFoundSysProperty;
    }

    // =================
    @Override
    public DglgResponse createWithTransaction(SysPropertyCreateRequest request) {
        // 测试事务
        return this.createWithTransactionImpl(request);
    }

    @Override
    public DglgResponse createWithoutTransaction(SysPropertyCreateRequest request) {
        // 无
        return this.createImpl(request);
    }

    // =================
    @Transactional
    private DglgResponse createWithTransactionImpl(SysPropertyCreateRequest request) {
        return this.createImpl(request);
    }

    private DglgResponse createImpl(SysPropertyCreateRequest request) {
        this.insert(request.toSysProperty());
        if (new Random().nextBoolean()) {
            // 测试事务
            throw new RuntimeException("random exception");
        }
        return this.insert(request.toSysProperty());
    }
}
