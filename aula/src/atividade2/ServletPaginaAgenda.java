package atividade2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPaginaAgenda
 */
@WebServlet("/ServletPaginaAgenda")
public class ServletPaginaAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPaginaAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    PrintWriter resposta = response.getWriter();
        resposta.write("<html><body>");
        resposta.write("Nome : " + request.getParameter("nome"));
        resposta.write("<br/>");
        resposta.write("Telefone :" + request.getParameter("telefone"));
        resposta.write("<br/>");
        resposta.write("Data de Nascimento :" + request.getParameter("datadenascimento"));
        resposta.write("</html></body>");
	}

}
