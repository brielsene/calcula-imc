<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List" %>
    <%@ page import="br.com.calculo.imc.modelo.*" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>

<ul>
	<c:forEach items="${lista}" var="lista">
<!-- a Expression Language facilita pra gente, então não precisamos chamar o método com o get, basta colocar o nome sem o get -->
<!-- e com letra minúscula -->
		<li>${lista.nome }</li>
		<li>${lista.peso }</li>
		<li>${lista.altura }</li>
		<br></br>
		
		
	</c:forEach>
</ul>


</head>
<body>

</body>
</html>