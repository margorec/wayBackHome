package com.marcingorecki.wayBackHome.controller;

import com.marcingorecki.wayBackHome.model.Data;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String mainView(Model model) {
        RestTemplateBuilder builder = new RestTemplateBuilder();
        RestTemplate rt = builder.build();
        ResponseEntity<Data> response = rt.getForEntity("http://87.98.237.99:88/delays?stopId=14550", Data.class);

        model.addAttribute("data", response.getBody().getLastUpdate());
        return "mainView";
    }

}

