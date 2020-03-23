package com.ysdrzp.controller;

import com.ysdrzp.model.Account;
import com.ysdrzp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/account")
public class AccountController {

    /**
     * 查询账户-基本类型和 String 类型作为参数
     * @return
     */
    @RequestMapping("/findAccount")
    public String findAccount(Integer accountId,String accountName) {
        System.out.println("查询账户:" + accountId + "," + accountName);
        return "success";
    }

    /**
     * 保存账户-POJO 类型作为参数
     * @param account
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
        System.out.println("保存账户："+account);
        return "success";
    }

    /**
     * 更新账户-POJO 类中包含集合类型参数
     * @param user
     * @return
     */
    @RequestMapping("/updateAccount")
    public String updateAccount(User user) {
        System.out.println("更新账户："+user);
        return "success";
    }

    /**
     * 删除账户
     * @return
     */
    @RequestMapping("/deleteAccount")
    public String deleteAccount(Date date) {
        System.out.println("删除账户："+date);
        return "success";
    }

    /**
     * 测试访问 testServletAPI
     * @return
     */
    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
        return "success";
    }

}
