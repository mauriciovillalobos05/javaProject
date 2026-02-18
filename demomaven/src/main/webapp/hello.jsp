<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<h2>Hello from JSP!</h2>

<c:forEach items="${['Java','HTTP','Servlets']}" var="item">
    <p>${item}</p>
</c:forEach>