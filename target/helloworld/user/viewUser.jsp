<%--
  Created by IntelliJ IDEA.
  User: Fernando.Galdino
  Date: 15/03/2023
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p><bean:message key="user.name"/></p>
    <bean:write name="u" property="name" />
<%--    <p>Age</p>--%>
<%--    <bean:write name="user" property="age" format="##" />--%>
<%--    <p>Sex</p>--%>
<%--    <bean:write name="user" property="sex" />--%>
    <p>About</p>
    <bean:write name="u" property="about" />
    <p>Favourites</p>
    <bean:write name="u" property="favourites" />
<%--    <p>Job</p>--%>
<%--    <bean:write name="user" property="job" />--%>
</body>
</html>
