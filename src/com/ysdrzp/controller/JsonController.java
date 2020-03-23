package com.ysdrzp.controller;

import com.ysdrzp.model.Account;
import com.ysdrzp.model.Address;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 响应 json 数据的控制器
 */
@Controller
@RequestMapping("/json")
public class JsonController {

    /**
     * 测试响应 json 数据
     */
    @RequestMapping("/testResponseJson")
    public @ResponseBody Account testResponseJson() {
        Account account = new Account();
        account.setName("张三");
        account.setMoney(Float.parseFloat("10000000"));
        Address address = new Address();
        address.setProvinceName("河南");
        address.setCityName("郑州");
        account.setAddress(address);
        return account;
    }

}
