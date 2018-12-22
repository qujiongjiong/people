<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<form action="${pageContext.request.contextPath}/all" method="post" >
    <input type="submit" value="查看"/>
</form>

<table border="1" cellspacing="0" cellpadding="0">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>age</td>
        <td colspan="2">操作</td>
    </tr>

    <c:forEach items="${sessionScope.list}" var="person">
        <tr>
            <td>${person.id}</td>
            <td>${person.name}</td>
            <td>${person.age}</td>
            <td><a href="updata?id=${person.id}">修改</a></td>
            <td><a href="del?id=${person.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
<a href="add.jsp">添加</a>


</body>
</html>
