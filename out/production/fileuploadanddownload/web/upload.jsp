<%--
  Created by IntelliJ IDEA.
  User: ShuKer
  Date: 2020/11/7
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
    <base href="http://localhost:8080/fileuploadanddownload/">
</head>
<body>
<form action="upload" method="POST" enctype="multipart/form-data">
    <input type="text" name="username" value="qingtian"> <br>
    <input type="password" name="password" value="qingtianS"><br>
    <input type="file" name="photo" ><br>
    <input type="submit" value="上传"><br>
    
</form>
</body>
</html>
