package com.ruoyi.study2.service.impl;

import com.ruoyi.study2.factory.Factory;
import com.ruoyi.study2.service.Handler;

public class ZhangsanHandler implements Handler {
    @Override
    public void test1(String nickName) {
        System.out.println("================张三================");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Factory.register("张三",this);
    }
}
