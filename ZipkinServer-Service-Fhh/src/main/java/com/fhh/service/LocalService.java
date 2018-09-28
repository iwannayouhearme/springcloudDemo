package com.fhh.service;

import org.springframework.stereotype.Service;

/**
 * 功能描述：（）
 * Created by biubiubiu小浩 on 2018-09-28 11:10
 */
@Service
public class LocalService {
    public String sayHi(String name){
        return "Hi,"+name+"i am from service-fhh";
    }
}
