package com.ruoyi.study.server.impl;

import com.ruoyi.study.server.*;

public class BMWFactory implements AbstractCarFactory {

    @Override
    public BClassCar build_B_ClassCar() {
        System.out.println("========================宝马工厂B级========================");
        return new Bwm3();
    }

    @Override
    public CClassCar build_C_ClassCar() {
        System.out.println("========================宝马工厂C级========================");
        return new Bwm5();
    }
}
