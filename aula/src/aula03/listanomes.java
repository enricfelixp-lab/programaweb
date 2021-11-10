package aula03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class listanomes
 */
@WebServlet("/listanomes")
public class listanomes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listanomes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter resposta = response.getWriter();
         resposta.write("<html><body>");
         resposta.write("Olá, os parâmetros recebidos por essa requisição são: <BR>");
         Enumeration<String> nomesParametros = request.getParameterNames();
         while (nomesParametros.hasMoreElements()) {
              resposta.write(nomesParametros.nextElement().toString());
              resposta.write(", ");
         }
         resposta.write("</html></body>");
      }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
