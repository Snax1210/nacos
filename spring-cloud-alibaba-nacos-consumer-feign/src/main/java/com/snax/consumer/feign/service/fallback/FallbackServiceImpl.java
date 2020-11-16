package com.snax.consumer.feign.service.fallback;

import com.snax.consumer.feign.service.FeignService;
import org.springframework.stereotype.Service;

@Service
public class FallbackServiceImpl implements FeignService
{
    @Override
    public String test(String message)
    {
       return "shabi 57";
    }
}
