package br.com.calculo.imc.modelo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaPessoas
 */
@WebServlet("/listaPessoas")
public class ListaPessoas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		Pessoa gabriel = new Pessoa("Gabriel", 90, 1.82);
		Pessoa joao = new Pessoa("Joao", 75, 1.80);
		
		banco.adicionaPessoa(gabriel);
		banco.adicionaPessoa(joao);
		request.setAttribute("lista", banco.getLista());
		RequestDispatcher rd = request.getRequestDispatcher("/listaPessoas.jsp");
		rd.forward(request, response);
	}

}
