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
    姓名：<input type="text" name="username" >
    密码：<input type="text" name="password" >
    姓名：<input type="text" name="age" >
    <input type="submit" value="提交"><br>
</form>
</body>
</html>
