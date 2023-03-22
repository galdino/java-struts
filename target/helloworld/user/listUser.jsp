<%--
  Created by IntelliJ IDEA.
  User: Fernando.Galdino
  Date: 15/03/2023
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <html:link page="/add-user.html"><bean:message key="button.submit"/></html:link>
    <logic:empty name="userList">
        <p>List empty!</p>
    </logic:empty>
    <logic:notEmpty name="userList">
        <table>
            <tr>
                <th><bean:message key="user.id"/></th>
                <th><bean:message key="user.name"/></th>
                <th><bean:message key="user.phone"/></th>
                <th><bean:message key="user.role"/></th>
                <th><bean:message key="option"/></th>
            </tr>
            <logic:iterate id="u" name="userList">
                <tr>
                    <td><bean:write name="u" property="id"/></td>
                    <td><bean:write name="u" property="name"/></td>
                    <td><bean:write name="u" property="phone"/></td>
                    <td>
                        <logic:equal value="ROLE_ADMIN" name="u" property="role"><bean:message key="user.role.admin"/></logic:equal>
                        <logic:equal value="ROLE_USER" name="u" property="role"><bean:message key="user.role.user"/></logic:equal>
                    </td>
                    </td>
                    <td>
                        <html:link page="/edit-user.html" paramId="userId" paramName="u" paramProperty="id">
                            <bean:message key="button.edit"/>
                        </html:link>
                        |
                        <html:link page="/delete-user.html" paramId="userId" paramName="u" paramProperty="id">
                            <bean:message key="button.delete"/>
                        </html:link>
                        |
                        <html:link page="/view-user.html" paramId="userId" paramName="u" paramProperty="id">
                            <bean:message key="button.view"/>
                        </html:link>
                    </td>
                </tr>
            </logic:iterate>
        </table>
    </logic:notEmpty>
</body>
</html>
