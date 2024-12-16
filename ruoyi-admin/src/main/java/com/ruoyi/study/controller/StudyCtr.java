package com.ruoyi.study.controller;

import com.ruoyi.study.factory.SimpleFactory;
import com.ruoyi.study.server.Car;
import com.ruoyi.study.server.impl.BMWFactory;
import com.ruoyi.study.server.impl.BenzFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("Study/test")
public class StudyCtr {

    public static void main(String[] args) {
/*        Car myCar = SimpleFactory.giveMeCar("Audi");
        if (myCar != null){
            myCar.showTheBrand();
        }else {
            System.out.println("没有这个汽车");
        }*/

        /*BMWFactory bmwFactory = new BMWFactory();
        Car myCar = bmwFactory.buildACar();
        myCar.showTheBrand();*/

        BMWFactory bmwFactory = new BMWFactory();
        BenzFactory benzFactory = new BenzFactory();

        bmwFactory.build_B_ClassCar().showClassB();
        benzFactory.build_C_ClassCar().showClassC();



    }

    @PostMapping("simpFacteryTest")
    public void simpFacteryTest(){

        System.out.println("==================simpFacteryTest==================");

    }


}
