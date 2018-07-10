package com.jiangshui.springbootpractic.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xujiangshui
 * @Date on 2018/6/28 0028
 */
@RestController
public class HelloWorld {

     @Reference(version = "2.0.1")
     com.jiangshui.springbootpractic.service.serviceTest serviceTest;

    @ResponseBody
    @RequestMapping("/hi")
    public String Hi(Integer id){
        String  name= serviceTest.findName(id);
        return  "Hi"+name;
    }
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return serviceTest.hello();
    }

    @ResponseBody
    @RequestMapping("/he")
    public String he(){
        return "hello world";
    }
}
