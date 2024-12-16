package com.ruoyi.study2.service.impl;

import com.ruoyi.study2.factory.Factory2;
import com.ruoyi.study2.service.AbstractHandler;
import org.springframework.stereotype.Component;

@Component
public class OshHandler extends AbstractHandler {
    @Override
    public void test1(String nickName) {
        System.out.println("================胡优秀================");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Factory2.register("胡优秀",this);
    }
}
