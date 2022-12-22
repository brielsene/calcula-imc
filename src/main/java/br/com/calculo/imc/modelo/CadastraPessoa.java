package br.com.calculo.imc.modelo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastraPessoa
 */
@WebServlet("/cadastraPessoa")
public class CadastraPessoa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Pessoa p = new Pessoa(request.getParameter("nome"), Double.parseDouble(request.getParameter("peso")),
				Double.parseDouble(request.getParameter("altura")));
		Banco b = new Banco();

		RequestDispatcher rd = request.getRequestDispatcher("/view.jsp");
		request.setAttribute("nome", p.getNome());
		request.setAttribute("peso", p.getPeso());
		request.setAttribute("altura", p.getAltura());

		b.adicionaPessoa(p);

		Pessoa p2 = new Pessoa("Gabriel", 85, 1.82);

		b.adicionaPessoa(p2);


		double imc = p.getPeso() / (p.getAltura() * 2);
		String descricao;

		if (imc < 18.5 || imc > 24.9) {
			descricao = "Você não está com peso normal, de acordo com tabela de IMC";
		} else {
			descricao = "você está com IMC adequado";
		}
		request.setAttribute("imc", imc);
		request.setAttribute("descricao", descricao);

		rd.forward(request, response);
	}

}
