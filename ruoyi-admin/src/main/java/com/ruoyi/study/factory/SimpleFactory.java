package com.ruoyi.study.factory;

import com.ruoyi.study.server.Car;
import com.ruoyi.study.server.impl.Audi;
import com.ruoyi.study.server.impl.BMW;
import com.ruoyi.study.server.impl.Benz;

public class SimpleFactory {

    public static Car giveMeCar(String carName) {
        if ("Audi".equals(carName)){
            return new Audi();
        }
        if ("BMW".equals(carName)){
            return new BMW();
        }
        if ("Benz".equals(carName)){
            return new Benz();
        }
        return null;




    }


}
