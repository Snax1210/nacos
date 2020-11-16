package com.snax.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author kingdee
 */
@FeignClient(value = "nacos-provider")
public interface FeignService
{
    @GetMapping(value = "/test/{message}")
    String test (@PathVariable("message") String message);

}
