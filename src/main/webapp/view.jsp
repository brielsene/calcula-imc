
<%
String nome = (String) request.getAttribute("nome");
String peso = String.valueOf(request.getAttribute("peso"));
String altura = String.valueOf(request.getAttribute("altura"));
String imc = String.valueOf(request.getAttribute("imc"));
String descricao = (String) request.getAttribute("descricao");


%>

<html><body>

Nome: <%=nome %>
<br></br>
Peso: <%=peso %>
<br></br>
Altura: <%=altura %>
<br></br>
IMC: <%=imc%>
<br></br>
Descrição: <%=descricao%>






</body></html>