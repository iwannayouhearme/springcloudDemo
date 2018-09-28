package com.fhh.controller;

import com.fhh.service.LocalService;
import com.fhh.service.UseHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：（）
 * Created by biubiubiu小浩 on 2018-09-28 11:10
 */
@RestController
public class FhhController {
    @Autowired
    private LocalService localService;
    @Autowired
    private UseHiService hiService;

    @RequestMapping(value = "hi")
    public String hi(String name){
        return localService.sayHi(name);
    }

    @RequestMapping(value = "/fhhHi")
    public String sayHiFromFhh(@RequestBody String name){
        return hiService.sayHiFromServiceHi(name);
    }
}
