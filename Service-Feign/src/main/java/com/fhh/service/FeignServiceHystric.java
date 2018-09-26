package com.fhh.service;

import org.springframework.stereotype.Component;

/**
 * 功能描述：（）
 * Created by biubiubiu小浩 on 2018-09-26 09:43
 */
@Component
public class FeignServiceHystric implements FeignService{
    @Override
    public String sayHiFromClientOne(String name) {
        return "error contact"+name;
    }
}
