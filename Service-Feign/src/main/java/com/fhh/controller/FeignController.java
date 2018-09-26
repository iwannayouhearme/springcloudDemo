package com.fhh.controller;

import com.fhh.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：（）
 * Created by biubiubiu小浩 on 2018-09-25 16:49
 */
@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return feignService.sayHiFromClientOne(name);
    }
}
