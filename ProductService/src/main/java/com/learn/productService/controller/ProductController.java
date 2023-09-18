package com.learn.productService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/allProducts")
    public List<String> getProducts(){
        return Arrays.asList("234232","112223","554345");
    }
}
