<%--
  Created by IntelliJ IDEA.
  User: ShuKer
  Date: 2020/12/15
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>update的jsp界面</title>
</head>
<body>
<h3>修改用户</h3>
<form method="post" action="${pageContext.request.contextPath}/user/initUser">
    用户名：<input type="text" name="username" value="${user.username}">
    密码：<input type="text" name="password" value="${user.password}">
    年龄：<input type="text" name="age" value="${user.age}">
</form>
</body>
</html>
