package com.learn.product.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    @Lazy
    public RestTemplate restTemplate;
/*
    env variable from GIT
    // (https://github.com/sarojbhol/config-server/blob/main/application.properties)

 */
    @Value("${product.service.url}")
    public String url;

//    public final String URL = "http://localhost:8081/allProducts";

    @GetMapping("/productList")
    public List getProductList(){
        return restTemplate.getForObject(url, List.class);
    }
}
