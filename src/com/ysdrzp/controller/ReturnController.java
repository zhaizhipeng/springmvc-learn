package com.ysdrzp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 响应数据和结果视图
 */
@Controller
@RequestMapping("/return")
public class ReturnController {

    //指定逻辑视图名，经过视图解析器解析为 jsp 物理路径：/WEB-INF/pages/success.jsp
    @RequestMapping("/testReturnString")
    public String testReturnString() {
        System.out.println("调用 testReturnString 方法");
        return "success";
    }

    @RequestMapping("/testReturnVoid")
    public void testReturnVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {

    }

    /**
     * 返回 ModeAndView
     * @return
     */
    @RequestMapping("/testReturnModelAndView")
    public ModelAndView testReturnModelAndView() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("username", "张三");
        mv.setViewName("success");
        return mv;
    }

    /**
     * 转发
     * @return
     */
    @RequestMapping("/testForward")
    public String testForward() {
        System.out.println("调用 testForward 方法");
        return "forward:/WEB-INF/pages/success.jsp";
    }

    /**
     * 重定向
     * @return
     */
    @RequestMapping("/testRedirect")
    public String testRedirect() {
        System.out.println("调用 testRedirect 方法");
        return "redirect:testReturnModelAndView";
    }

}
