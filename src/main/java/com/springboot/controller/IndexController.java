package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yuanwenjie on 2017/3/11.
 */
@RestController
public class IndexController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("HOME-----------------------");
        return "HOME";
    }

    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        System.out.println("----------------------");
        return restTemplate.getForEntity("http://reservation-service/add?a=10&b=20", String.class).getBody();
    }
}
