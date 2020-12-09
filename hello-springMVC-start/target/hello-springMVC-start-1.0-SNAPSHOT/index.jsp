<%--
  Created by IntelliJ IDEA.
  User: ShuKer
  Date: 2020/12/9
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>springmvc</title>
</head>
<body>
    <h3>入门案例</h3>
    <a href="${pageContext.request.contextPath}/hello">入门案例</a>

    <form method="post" action="saveAccount">
        姓名：<input type="text" name="userName" >
        金钱：<input type="text" name="money" >
        <input type="submit" value="提交">
    </form>
</body>
</html>
