package com.fhh.controller;

import com.fhh.service.LocalService;
import com.fhh.service.UseFhhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：（）
 * Created by biubiubiu小浩 on 2018-09-28 10:47
 */
@RestController
public class HiController {
    @Autowired
    private LocalService localService;
    @Autowired
    private UseFhhService useFhhService;

    @RequestMapping(value = "/hi")
    public String sayHiFromFhh(String name){
        return useFhhService.sayHiFromFhh(name);
    }

    @RequestMapping(value = "/sayHiFromServiceHi")
    public String sayHiFromServiceHi(@RequestBody String name){
        return localService.sayHi(name);
    }
}
