package com.snax.consumer.feign.controller;

import com.snax.consumer.feign.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author kingdee
 */
@RestController
public class NacosConsumerFeignController
{
    @Resource
    private FeignService feignService;

    @GetMapping(value = "/test/hi")
    public String test()
    {
        return feignService.test("Hi Feign");
    }
}
