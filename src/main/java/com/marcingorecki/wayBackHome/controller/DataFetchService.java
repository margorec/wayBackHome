package com.marcingorecki.wayBackHome.controller;

import com.marcingorecki.wayBackHome.model.dto.Data;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DataFetchService {

    public Data fetchData() {
        RestTemplateBuilder builder = new RestTemplateBuilder();
        RestTemplate rt = builder.build();
        ResponseEntity<Data> response = rt.getForEntity("http://87.98.237.99:88/delays?stopId=14550", Data.class);
        return response.getBody();
    }

}
