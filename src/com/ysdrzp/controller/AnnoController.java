package com.ysdrzp.controller;

import com.ysdrzp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 注解
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    /**
     * requestParams 注解的使用
     * @param username
     * @return
     */
    @RequestMapping("/useRequestParam")
    public String useRequestParam(@RequestParam("name")String username, @RequestParam(value="age",required=false)Integer age){
        System.out.println(username+","+age);
        return "success";
    }

    /**
     * RequestBody 注解
     * @param body
     * @return
     */
    @RequestMapping("/useRequestBody")
    public String useRequestBody(@RequestBody(required=false) String body){
        System.out.println(body);
        return "success";
    }

    /**
     * PathVariable 注解
     * @param id
     * @return
     */
    @RequestMapping("/usePathVariable/{id}")
    public String usePathVariable(@PathVariable("id") Integer id){
        System.out.println(id);
        return "success";
    }

    /**
     * post 请求：保存
     * @param user
     * @return
     */
    @RequestMapping(value="/testRestPOST",method= RequestMethod.POST)
    public String testRestfulURLPOST(User user){
        System.out.println("rest post"+user);
        return "success";
    }

    /**
     * put 请求：更新
     * @param id
     * @param user
     * @return
     */
    @RequestMapping(value="/testRestPUT/{id}",method=RequestMethod.PUT)
    public String testRestfulURLPUT(@PathVariable("id")Integer id,User user){
        System.out.println("rest put "+id+","+user);
        return "success";
    }

    /**
     * post 请求：删除
     * @param id
     * @return
     */
    @RequestMapping(value="/testRestDELETE/{id}",method=RequestMethod.DELETE)
    public String testRestfulURLDELETE(@PathVariable("id")Integer id){
        System.out.println("rest delete "+id);
        return "success";
    }

    /**
     * post 请求：查询
     * @param id
     * @return
     */
    @RequestMapping(value="/testRestGET/{id}",method=RequestMethod.GET)
    public String testRestfulURLGET(@PathVariable("id")Integer id){
        System.out.println("rest get "+id);
        return "success";
    }

    /**
     * RequestHeader 注解
     * @param requestHeader
     * @return
     */
    @RequestMapping("/useRequestHeader")
    public String useRequestHeader(@RequestHeader(value="Accept-Language", required=false)String requestHeader){
        System.out.println(requestHeader);
        return "success";
    }

    /**
     * Cookie 注解注解
     * @param cookieValue
     * @return
     */
    @RequestMapping("/useCookieValue")
    public String useCookieValue(@CookieValue(value="JSESSIONID",required=false) String cookieValue){
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * 被 ModelAttribute 修饰的方法
     * @param user
     */
    @ModelAttribute
    public void showModel(User user) {
        System.out.println("执行了 showModel 方法"+user.getUsername());
    }

    /**
     * 接收请求的方法
     * @param user
     * @return
     */
    /*@RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user) {
        System.out.println("执行了控制器的方法"+user.getUsername());
        return "success";
    }*/

    /**
     * 查询数据库中用户信息
     * @param username
     */
    @ModelAttribute
    public User showModel(String username) {
        //模拟去数据库查询
        User abc = findUserByName(username);
        System.out.println("执行了 showModel 方法"+abc);
        return abc;
    }

    /**
     * 模拟修改用户方法
     * @param user
     * @return
     */
    /*@RequestMapping("/updateUser")
    public String testModelAttribute(User user) {
        System.out.println("控制器中处理请求的方法：修改用户："+user);
        return "success";
    }*/

    /**
     * 查询数据库中用户信息
     * @param username
     * @param map
     */
    @ModelAttribute
    public void showModel(String username, Map<String,User> map) {
        //模拟去数据库查询
        User user = findUserByName(username);
        System.out.println("执行了 showModel 方法"+user);
        map.put("abc",user);
    }

    /**
     * 模拟修改用户方法
     * @param user
     * @return
     */
    @RequestMapping("/updateUser")
    public String testModelAttribute(@ModelAttribute("abc")User user) {
        System.out.println("控制器中处理请求的方法：修改用户："+user);
        return "success";
    }

    /**
     * 模拟去数据库查询
     * @param username
     * @return
     */
    private User findUserByName(String username) {
        User user = new User();
        user.setUsername(username);
        user.setAge(19);
        user.setPassword("123456");
        return user;
    }

}
