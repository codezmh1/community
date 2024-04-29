package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype") // 默认单例，加prototype则每次访问Bean都创造一个新实例
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService() {
        System.out.println("实例化AlphaService");
    }

    @PostConstruct // 此方法在构造器之后调用
    public void init() {
        System.out.println("初始化AlphaService");
    }

    @PreDestroy // 销毁对象之前调用它
    public void destory() {
        System.out.println("销毁AlphaService");
    }

    public String find() { //模拟查询业务
        return alphaDao.select();
    }
}
