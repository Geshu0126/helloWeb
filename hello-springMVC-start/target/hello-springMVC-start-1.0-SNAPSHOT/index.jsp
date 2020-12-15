<%--
  Created by IntelliJ IDEA.
  User: ShuKer
  Date: 2020/12/14
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>helloSpringMVC</title>
</head>
`
<body>
<h3>springmvc入门案例</h3>
<a href="${pageContext.request.contextPath}/hello">入门案例</a>

<br>

<form action="${pageContext.request.contextPath}/user/helloParam" method="post">
    姓名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    年龄：<input type="text" name="age"><br>

    <input type="submit" value="提交"><br>
</form>
<h3>helloDomainParam</h3>
<br>

<form action="${pageContext.request.contextPath}/user/helloDomainParam1" method="post">
    姓名：<input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>
    年龄：<input type="text" name="age"><br>

    <input type="submit" value="提交"><br>
</form>

<h3>helloDomainParam2</h3>
<br>
<form action="${pageContext.request.contextPath}/user/helloDomainParam2" method="post">
    账户id:<input type="text" name="accountId" ><br>
    账户余额:<input type="text" name="money" ><br>
    姓名：<input type="text" name="user.username"><br>
    密码：<input type="text" name="user.password"><br>
    年龄：<input type="text" name="user.age"><br>

    <input type="submit" value="提交"><br>
</form>

<h3>helloDomainParam3(list and map)</h3>
<br>
<form action="${pageContext.request.contextPath}/user/helloDomainParam3" method="post">
    生产地址：<input type="text" name="address" id=""><br>
    用户名：<input type="text" name="userList[0].username" ><br>
    用户密码：<input type="text" name="userList[0].password" ><br>
    用户年龄：<input type="text" name="userList[0].age" ><br>
    
    账户id:<input type="text" name="accountMap['one'].accountId" ><br>
    账户id:<input type="text" name="accountMap['one'].money" ><br>
    <input type="submit" value="提交"><br>
</form>

<h3>helloDomainParam4(formatTest)</h3>
<br>
<form action="${pageContext.request.contextPath}/user/helloDomainParam4" method="post">
    <input type="text" name="dateTime"><br>
    <input type="submit" value="提交"><br>
</form>

<h3>springMVC---Request</h3>
<br>
<form action="${pageContext.request.contextPath}/user/supportRequest" method="post">
    姓名：<input type="text" name="username" ><br>
    密码：<input type="text" name="password" ><br>
    年纪：<input type="text" name="age" ><br>
    <input type="submit" value="提交"><br>
</form>

<h3>springMVC---requestParamTest</h3>
<br>
<form action="${pageContext.request.contextPath}/user/requestParamTest" method="post">
    姓名：<input type="text" name="username" ><br>
    密码：<input type="text" name="password" ><br>
    年纪：<input type="text" name="age" ><br>
    <input type="submit" value="提交"><br>
</form>

<h3>springMVC---requestBodyTest</h3>
<br>
<form action="${pageContext.request.contextPath}/user/requestBodyTest" method="post">
    姓名：<input type="text" name="username" ><br>
    密码：<input type="text" name="password" ><br>
    年纪：<input type="text" name="age" ><br>
    <input type="submit" value="提交"><br>
</form>

<h3>springMVC---pathVariableTest</h3>
<br>
<form action="${pageContext.request.contextPath}/user/pathVariableTest/10" method="post">
    姓名：<input type="text" name="username" ><br>
    密码：<input type="text" name="password" ><br>
    年纪：<input type="text" name="age" ><br>
    <input type="submit" value="提交"><br>
</form>

<h3>springMVC---ModelAttributeTest1---have result type</h3>
<br>
<form action="${pageContext.request.contextPath}/user/updateUser" method="post">
    姓名：<input type="text" name="username" ><br>

    <input type="submit" value="提交"><br>
</form>

<h3>springMVC---ModelAttributeTest--- no result type </h3>
<br>
<form action="${pageContext.request.contextPath}/user/updateUser1" method="post">
    姓名：<input type="text" name="username" ><br>

    <input type="submit" value="提交"><br>
</form>

<h3>springMVC---SessionAttributes </h3>
<br>
<a href="${pageContext.request.contextPath}/account/save">往session域中存值</a>
<a href="${pageContext.request.contextPath}/account/find">往session域中取值</a>
<a href="${pageContext.request.contextPath}/account/delete">删除session域中的值</a>
<h3>springMVC---响应数据和结果视图Test1</h3>
<br>
<a href="${pageContext.request.contextPath}/user/initUser">update</a>


<h3>springMVC---响应数据和结果视图Test1(请求转发)</h3>
<br>
<a href="${pageContext.request.contextPath}/user/initAddRequest">请求转发</a>

<h3>springMVC---响应数据和结果视图Test1(请求重定向)</h3>
<br>
<a href="${pageContext.request.contextPath}/user/initAddResponse">请求重定向</a>

<h3>springMVC---响应数据和结果视图Test1(请求重定向--直接响应数据)</h3>
<br>
<a href="${pageContext.request.contextPath}/user/initAddResponseWrite">请求重定向--直接响应数据</a>
</body>

<h3>springMVC---ModelAndView</h3>
<br>
<a href="${pageContext.request.contextPath}/user/modelAndView">modelAndView</a>
</body>



<h3>springMVC---SpringMVC框架提供的转发和重定向</h3>
<br>
<a href="${pageContext.request.contextPath}/user/delete">SpringMVC框架提供的转发</a>
<a href="${pageContext.request.contextPath}/user/count">SpringMVC框架提供的重定向</a>
</body>
</html>
