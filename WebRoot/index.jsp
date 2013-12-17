<%--
  Created by IntelliJ IDEA.
  User: Ajian
  Date: 13-11-28
  Time: 下午2:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>GroovyAndSpringStudy</h1>
    <p>good good study,day day up!</p>
    <%
        Object o = request.getAttribute("str");
    %>
    <h2><%=o==null?"":o.toString()%></h2>
</body>
</html>