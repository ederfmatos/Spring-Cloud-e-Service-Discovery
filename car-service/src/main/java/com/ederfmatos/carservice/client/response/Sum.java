package com.ederfmatos.carservice.client.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.With;

@Getter
@RequiredArgsConstructor
public class Sum {

    private final String id;
    private final String name;
    private final Long total;

    @Setter
    private String random;

}
