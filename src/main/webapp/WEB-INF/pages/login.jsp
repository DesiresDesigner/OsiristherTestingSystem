<%--
  Created by IntelliJ IDEA.
  User: desiresdesigner
  Date: 3/6/15
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>OTS LOGIN</title>
</head>
<body>
${pageContext.request.contextPath}/SecurityController/check.action
<form:form modelAttribute="person"
            name="myForm"
            action="/lol"
            method="post">
    <form:input path="login" placeholder="login here"/> <br/>
    <form:input path="password" placeholder="password here"/> <br/>
    <input type="submit" value="Sing In" />
</form:form>


</body>
</html>
