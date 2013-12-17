<%--
  Created by IntelliJ IDEA.
  User: Ajian
  Date: 13-11-29
  Time: 下午5:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<table border="1">
    <tr>
        <th>id</th><th>firstName</th><th>lastName</th><th>locationId</th><th>locationName</th><th>do</th>
    </tr>
    <c:forEach items="${dataList}" var="d">
        <tr>
            <td>${d.id}</td>
            <td>${d.firstname}</td>
            <td>${d.lastname}</td>
            <td>${d.location_id}</td>
            <td>${d.location_name}</td>
            <td><a href="http://localhost/GroovyAndSpringStudy/dbtest/delete/${d.id}">del</a>&nbsp;</td>
        </tr>
    </c:forEach>

</table>


</body>
<head>
    <title>groovytesttable表中数据集合</title>
</head>
</html>