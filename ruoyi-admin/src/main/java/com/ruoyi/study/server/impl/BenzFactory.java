package com.ruoyi.study.server.impl;

import com.ruoyi.study.server.*;

public class BenzFactory implements AbstractCarFactory {

    @Override
    public BClassCar build_B_ClassCar() {
        System.out.println("========================奔驰工厂B级========================");
        return new BenzB();
    }

    @Override
    public CClassCar build_C_ClassCar() {
        System.out.println("========================奔驰工厂C级========================");
        return new BenzC();
    }
}
