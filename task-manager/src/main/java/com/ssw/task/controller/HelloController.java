package com.ssw.task.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

//Swagger2的注解，表明这个Controller的作用
@Api(tags = {"hello示例"})
//日志注解
@Slf4j
//数据验证注解
@Validated
@Controller
public class HelloController {

    @ApiOperation("hello示例")
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "hello world " +name;
    }
    @ApiOperation("index")
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
