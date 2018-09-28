package com.fhh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 功能描述：（）
 * Created by biubiubiu小浩 on 2018-09-28 10:53
 */
@FeignClient(value = "service-fhh")
public interface UseFhhService {
    /**
     * fetch data by rule id
     * @return Result<XxxxDO>
     */
    @RequestMapping(value = "/fhhHi")
    String sayHiFromFhh(String name);
}
