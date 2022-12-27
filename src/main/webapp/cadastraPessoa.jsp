<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>


<html><body>

<%-- <c:url value="/CadastraPessoaServlet" var="linkServletCadastraPessoa"/>  --%>
<form action="/calcula-imc/cadastraPessoa" method="post">

Nome: <input type="text"  name="nome"/>
<br></br>
Peso: <input type="text"  name="peso"/>
Altura <input type="text" name = "altura"/>
Data de Cadastro: <input type="text" name="data"/>

<input type="submit" value="Calcular"/>

</form>





</body></html>