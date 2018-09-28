package com.fhh.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 功能描述：（）
 * Created by biubiubiu小浩 on 2018-09-28 10:53
 */
@Service
public class LocalService {
    public String sayHi(@RequestBody String name) {
        return "hi,"+name+"i am from service-hi";
    }
}
