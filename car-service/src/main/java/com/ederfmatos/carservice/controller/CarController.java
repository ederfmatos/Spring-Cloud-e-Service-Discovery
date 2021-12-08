package com.ederfmatos.carservice.controller;

import com.ederfmatos.carservice.client.SumClient;
import com.ederfmatos.carservice.client.response.Sum;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {

    private final SumClient sumClient;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Sum sum() {
        Sum sum = sumClient.sum();
        sum.setRandom(UUID.randomUUID().toString());
        return sum;
    }

}
