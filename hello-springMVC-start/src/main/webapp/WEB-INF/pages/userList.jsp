<%--
  Created by IntelliJ IDEA.
  User: ShuKer
  Date: 2020/12/15
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>用户集合</title>
</head>

<body>
<h3>查看所有数据</h3>
    <c:forEach items="${users}" var="user">
        用户名：${user.username}<br>
        用户密码：${user.password}<br>
        用户年纪：${user.age}<br>
    </c:forEach>
</body>
</html>
