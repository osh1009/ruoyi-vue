package com.ruoyi.study2.factory;

import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.study2.service.AbstractHandler;
import com.ruoyi.study2.service.Handler;

import java.util.HashMap;
import java.util.Map;

public class Factory2 {
    private static Map<String, AbstractHandler> strategyMap = new HashMap<>();

    public static AbstractHandler getInvoker(String key) {
        return strategyMap.get(key);
    }


    public static void register(String key, AbstractHandler handler) {
        if(StringUtils.isEmpty(key)||null==handler){
            return;
        }
        strategyMap.put(key, handler);
    }






}
