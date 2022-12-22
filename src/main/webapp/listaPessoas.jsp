<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List" %>
    <%@ page import="br.com.calculo.imc.modelo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Pessoas</title>

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

</head>
<body>

</body>
</html>