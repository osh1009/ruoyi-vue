package com.ruoyi.study2.factory;

import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.study2.service.Handler;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static Map<String, Handler> strategyMap = new HashMap<>();

    public static Handler getInvoker(String key) {
        return  strategyMap.get(key);
    }


    public static void register(String key, Handler handler) {
        if(StringUtils.isEmpty(key)||null==handler){
            return;
        }
        strategyMap.put(key, handler);
    }






}
