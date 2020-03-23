package com.ysdrzp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/testException")
    public void testException(){
        System.out.println("测试自定义异常");
        int b = 10/0;
    }

    @RequestMapping("/testIntercepter")
    public void testIntercepter(){
        System.out.println("测试自定义拦截器");
    }
}
