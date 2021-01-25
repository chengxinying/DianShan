package com.atguigu.gmall.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestApiController {

    @RequestMapping("test")
    public String test(){

        return "test";
    }

}
