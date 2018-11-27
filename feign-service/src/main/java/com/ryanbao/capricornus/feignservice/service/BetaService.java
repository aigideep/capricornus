package com.ryanbao.capricornus.feignservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zlyan
 * @date: 2018/11/22
 * @time: 15:01
 * @description:
 **/
@FeignClient(value = "beta-service", fallback = BetaServiceHystrix.class)
public interface BetaService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);
}
