<%--
  Created by IntelliJ IDEA.
  User: ShuKer
  Date: 2020/11/8
  Time: 0:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()
            +"://"
            +request.getServerName()
            +":"
            +request.getServerPort()
            +request.getContextPath()
            +"/";

%>
<base href="<%=basePath%>">
<!--写base标签，永远固定相对路径跳转的结果-->
<link type="text/css" rel="stylesheet" href="static/css/style.css" >
<script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>