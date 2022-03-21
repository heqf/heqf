package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author: heqf
 * @date: 2022-03-21 16:25
 * @version 1.0
 **/
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("test1")
    public String test1(){
        return "test1";
    }

}
