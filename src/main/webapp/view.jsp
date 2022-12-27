
 <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<html><body>

<c:if test="${not empty nome}">
	Nome: ${nome }

</c:if>

<c:if test="${empty nome}">
	Nenhum nome cadastrado

</c:if>



<br></br>


Peso: ${peso }
<br></br>
Altura: ${altura }
<br></br>
IMC: ${imc }
<br></br>
Descrição: ${descricao }
<br></br>
Data de cadastro: ${data }








</body></html>