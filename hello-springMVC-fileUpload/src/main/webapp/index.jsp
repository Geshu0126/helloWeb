<%--
  Created by IntelliJ IDEA.
  User: ShuKer
  Date: 2020/12/16
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>传统文件上传</h3>
    <form action="${pageContext.request.contextPath}/user/fileUpload1" method="post" enctype="multipart/form-data">
        选择文件：<input type="file"  name="upload"><br>
        <input type="submit" value="上传文件">
    </form>

    <h3>springMVC文件上传</h3>
    <form action="${pageContext.request.contextPath}/user/fileUpload2" method="post" enctype="multipart/form-data">
        选择文件：<input type="file"  name="upload"><br>
        <input type="submit" value="上传文件">
    </form>
</body>
</html>
