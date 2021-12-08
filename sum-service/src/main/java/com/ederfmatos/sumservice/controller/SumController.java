package com.ederfmatos.sumservice.controller;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/sum")
public class SumController {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public SumResponse sum() {
        return new SumResponse(UUID.randomUUID().toString(), applicationName, RandomUtils.nextLong());
    }

}
