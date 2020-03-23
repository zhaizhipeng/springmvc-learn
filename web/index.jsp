<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

    <%--<a href="account/findAccount?accountId=10&accountName=zhangsan">查询账户</a>
    <a href="account/deleteAccount?date=2018-01-01">根据日期删除账户</a>--%>

    <%--<form action="account/saveAccount" method="post">
      账户名称：<input type="text" name="name" ><br/>
      账户金额：<input type="text" name="money" ><br/>
      账户省份：<input type="text" name="address.provinceName" ><br/>
      账户城市：<input type="text" name="address.cityName" ><br/>
      <input type="submit" value="保存">
    </form>--%>

    <!-- POJO 类包含集合类型演示 -->
    <%--<form action="account/updateAccount" method="post">
      用户名称：<input type="text" name="username" ><br/>
      用户密码：<input type="password" name="password" ><br/>
      用户年龄：<input type="text" name="age" ><br/>
      账户 1 名称：<input type="text" name="accounts[0].name" ><br/>
      账户 1 金额：<input type="text" name="accounts[0].money" ><br/>
      账户 2 名称：<input type="text" name="accounts[1].name" ><br/>
      账户 2 金额：<input type="text" name="accounts[1].money" ><br/>
      账户 3 名称：<input type="text" name="accountMap['one'].name" ><br/>
      账户 3 金额：<input type="text" name="accountMap['one'].money" ><br/>
      账户 4 名称：<input type="text" name="accountMap['two'].name" ><br/>
      账户 4 金额：<input type="text" name="accountMap['two'].money" ><br/>
      <input type="submit" value="保存">
    </form>--%>

    <!-- 原始 ServletAPI 作为控制器参数 -->
    <%--<a href="account/testServletAPI">测试访问 ServletAPI</a>--%>

    <!-- requestParams 注解的使用 -->
    <a href="anno/useRequestParam?name=test">requestParam 注解</a>

    <!-- request body 注解 -->
    <form action="anno/useRequestBody" method="post">
      用户名称：<input type="text" name="username" ><br/>
      用户密码：<input type="password" name="password" ><br/>
      用户年龄：<input type="text" name="age" ><br/>
      <input type="submit" value="保存">
    </form>

    <a href="anno/useRequestBody?body=test">requestBody 注解 get 请求</a>

    <!-- PathVariable 注解 -->
    <a href="anno/usePathVariable/100">pathVariable 注解</a>

    <!-- 保存 -->
    <form action="anno/testRestPOST" method="post">
      用户名称：<input type="text" name="username"><br/>
      <input type="submit" value="保存">
    </form>
    <hr/>
    <!-- 更新 -->
    <form action="anno/testRestPUT/1" method="post">
      用户名称：<input type="text" name="username"><br/>
      <input type="hidden" name="_method" value="PUT">
      <input type="submit" value="更新">
    </form>
    <hr/>
    <!-- 删除 -->
    <form action="anno/testRestDELETE/1" method="post">
      <input type="hidden" name="_method" value="DELETE">
      <input type="submit" value="删除">
    </form>
    <hr/>
    <!-- 查询一个 -->
    <form action="anno/testRestGET/1" method="post">
      <input type="hidden" name="_method" value="GET">
      <input type="submit" value="查询">
    </form>

    <!-- RequestHeader 注解 -->
    <a href="anno/useRequestHeader">获取请求消息头</a>
    <hr/>
    <!-- CookieValue 注解 -->
    <a href="anno/useCookieValue">绑定 cookie 的值</a>
    <hr/>
    <!-- ModelAttribute 注解的基本使用 -->
    <a href="anno/testModelAttribute?username=test">测试 modelattribute</a>
    <hr/>
    <!-- 修改用户信息 -->
    <form action="anno/updateUser" method="post">
      用户名称：<input type="text" name="username" ><br/>
      用户年龄：<input type="text" name="age" ><br/>
      <input type="submit" value="保存">
    </form>
    <hr/>
    <!-- 修改用户信息 -->
    <form action="anno/updateUser" method="post">
      用户名称：<input type="text" name="username" ><br/>
      用户年龄：<input type="text" name="age" ><br/>
      <input type="submit" value="保存">
    </form>
    <hr/>
    <!-- SessionAttribute 注解的使用 -->
    <a href="session/testPut">存入 SessionAttribute</a>
    <hr/>
    <a href="session/testGet">取出 SessionAttribute</a>
    <hr/>
    <a href="session/testClean">清除 SessionAttribute</a>
  </body>
</html>
