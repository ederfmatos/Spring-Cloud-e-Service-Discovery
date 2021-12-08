package com.ederfmatos.carservice.client;

import com.ederfmatos.carservice.client.response.Sum;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("sum-service")
public interface SumClient {

    @GetMapping("/sum")
    Sum sum();

}
