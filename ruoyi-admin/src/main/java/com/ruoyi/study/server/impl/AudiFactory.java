package com.ruoyi.study.server.impl;

import com.ruoyi.study.server.Car;
import com.ruoyi.study.server.CarFactory;

public class AudiFactory implements CarFactory {
    @Override
    public Car buildACar() {
        System.out.println("========================奥迪工厂========================");
        return new Audi();
    }
}
