<%--
  Created by IntelliJ IDEA.
  User: Fernando.Galdino
  Date: 15/03/2023
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <form action="/struts_war/view-user.html" method="post">--%>
<%--        <p>Name</p><input name="name" type="text">--%>
<%--        <p>Age</p><input name="age" type="number">--%>
<%--        <input name="Submit" type="submit">--%>
<%--    </form>--%>

    <p style="color: red">
        <html:errors />
    </p>
    <html:form action="/add-user-post.html" method="post">
        <p><bean:message key="user.name"/></p>
        <html:messages id="name_error" property="user.name.required">
            <p style="color: red">
                <bean:write name="name_error"/>
            </p>
        </html:messages>
        <html:text property="name" name="user"/>

        <p><bean:message key="user.phone"/></p>
<%--        <html:messages id="age_error" property="user.age.invalid">--%>
<%--            <p style="color: red">--%>
<%--                <bean:write name="age_error"/>--%>
<%--            </p>--%>
<%--        </html:messages>--%>
        <html:text property="phone" name="user"/>

        <p><bean:message key="user.username"/></p>
<%--        <html:radio property="sex" value="Man" name="user">Man</html:radio>--%>
<%--        <html:radio property="sex" value="Woman" name="user">Woman</html:radio>--%>
        <html:text property="username" name="user"/>

        <p><bean:message key="user.password"/></p>
        <html:text property="password" name="user"/>


        <p><bean:message key="user.about"/></p>
        <html:textarea property="about" name="user"/>

        <p><bean:message key="user.favourites"/></p>
        <html:checkbox property="favourites" name="user" value="Mountain">Mountain</html:checkbox>
        <html:checkbox property="favourites" name="user" value="Beach">Beach</html:checkbox>

        <p><bean:message key="user.role"/></p>
        <html:checkbox property="role" name="user" value="ROLE_ADMIN"><bean:message key="user.role.admin"/></html:checkbox>
        <html:checkbox property="role" name="user" value="ROLE_USER"><bean:message key="user.role.user"/></html:checkbox>

<%--        <p><bean:message key="user.job"/></p>--%>
<%--        <html:select property="job" name="user">--%>
<%--            <html:option value="IT">IT</html:option>--%>
<%--            <html:option value="HR">HR</html:option>--%>
<%--            <html:option value="FI">FI</html:option>--%>
<%--        </html:select>--%>


        <html:submit><bean:message key="button.submit"/></html:submit>
    </html:form>
</body>
</html>
