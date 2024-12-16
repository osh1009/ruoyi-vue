package com.ruoyi.study2.controller;

import com.ruoyi.study2.factory.Factory;
import com.ruoyi.study2.factory.Factory2;
import com.ruoyi.study2.service.AbstractHandler;
import com.ruoyi.study2.service.Handler;
import com.ruoyi.study2.service.impl.OshHandler;
import org.springframework.stereotype.Component;

@Component
public class Demo {


    public static void main(String[] args) {

        String nickName = "胡优秀";

        AbstractHandler invoker = Factory2.getInvoker(nickName);
        invoker.test1(nickName);


/*
        if (nickName.equals("胡优秀")){
            new OshHandler().test1(nickName);

            System.out.println("==================胡优秀在这处理了什么==================");
        }else if(nickName.equals("张三丰")){
            System.out.println("==================张三丰在这处理了什么==================");
        } else if (nickName.equals("李四")) {
            System.out.println("==================李四在这处理了什么==================");
        } else if (nickName.equals("王五")) {
            System.out.println("==================王五在这处理了什么==================");
        }
*/



    }

}
