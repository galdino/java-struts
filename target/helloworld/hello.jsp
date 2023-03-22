<%--
  Created by IntelliJ IDEA.
  User: Fernando.Galdino
  Date: 14/03/2023
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>
        <bean:write name="user" property="name"/>
    </h1>
    <h2>
        <bean:write name="user" property="age" format="###"/>
    </h2>
</body>
</html>
