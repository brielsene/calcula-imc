<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="br.com.calculo.imc.modelo.*, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<ul>






    <%
        List<Pessoa>lista = (List<Pessoa>)request.getAttribute("lista");
    	lista.sort((l1, l2)->l2.getNome().compareTo(l1.getNome()));
    	for (Pessoa pessoa : lista) { 
    %>
        
        <li><%= pessoa.getNome() %></li>
        <li><%= pessoa.getPeso() %></li>
        <li><%= pessoa.getAltura() %></li>
        <br></br>
    <%
        }
    %>
    </ul>

</body>
</html>