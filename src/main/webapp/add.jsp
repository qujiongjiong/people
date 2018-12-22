<%--
  Created by IntelliJ IDEA.
  User: 25778
  Date: 2018/11/23
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/add" method="post">
    <input  type="hidden" name="id" value="${person.id}"/>
    姓名<input type="text" name="name" value="${person.name }"/>
    年龄<input type="text" name="age" value="${person.age}"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
