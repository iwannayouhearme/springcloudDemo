package com.fhh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 功能描述：（）
 * Created by biubiubiu小浩 on 2018-09-25 16:49
 */
@FeignClient(value = "eureka-client",fallback = FeignServiceHystric.class)
public interface FeignService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}