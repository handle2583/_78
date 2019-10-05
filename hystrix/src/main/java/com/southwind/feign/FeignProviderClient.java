package com.southwind.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider")
public interface FeignProviderClient {


    @GetMapping("/student/index")
    public String index();
}
