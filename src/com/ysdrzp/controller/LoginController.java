package com.ysdrzp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    /**
     * 登陆页面
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }

    /**
     * 登陆提交
     * @param session
     * @param username
     * @param pwd
     * @return
     * @throws Exception
     */
    @RequestMapping("/loginSubmit")
    public String loginSubmit(HttpSession session, String username, String pwd) {
        //向 session 记录用户身份信息
        session.setAttribute("user", username);
        System.out.println(session);
        return "success";
    }

    /**
     * 退出
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        //session 过期
        session.invalidate();
        return "redirect:index.jsp";
    }

}
