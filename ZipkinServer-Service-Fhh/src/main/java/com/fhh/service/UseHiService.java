package com.fhh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述：（）
 * Created by biubiubiu小浩 on 2018-09-28 11:15
 */
@FeignClient(value = "service-hi")
public interface UseHiService {
    @RequestMapping(value = "/sayHiFromServiceHi")
    String sayHiFromServiceHi(@RequestBody String name);
}
