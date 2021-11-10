package aula04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import atividade6.ServletLogin;

/**
 * Servlet implementation class menufun��es
 */
@WebServlet("/menufun��es")
public class menufun��es extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public menufun��es() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

doPost(request,response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
        resposta.write("<html><body>");
        HttpSession sessao = request.getSession(false);
        if (sessao == null || sessao.getAttribute(ServletLogin.USUARIO) == null) {
            resposta.write("<a href=\"login.html\">Fa�a primeiro o seu login</a><BR>");
        } else {
            resposta.write("<b>Opera��es dispon�veis:</b><BR>");
            resposta.write("<a href=\"cadastro.html\">1. Cadastro</a><BR>");
            // Novas op��es de funcionalidades entram aqui!
        }
        resposta.write("</body></html>");
	}

}
