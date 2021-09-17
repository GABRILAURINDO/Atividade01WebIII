package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("")
public class AppServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
				PrintWriter out = resp.getWriter();
				
				//EX 01
				out.print("Olá mundo!");
			
			    out.print("<hr>"); 
			
				//EX 2-a ----------------------------------------------------
				String method = req.getMethod();
				out.print("<p> O método é : " +method+ "</p>");
				
				String uri = req.getRequestURI();
				out.print("<p> URI do Pedido é : " +uri+ "</p>");
				
				String protocol = req.getProtocol();
				out.print("<p> O protocolo é : " +protocol+ "</p>");
			
				out.print("<hr>");
				
				//EX 2-b-----------------------------------------------------
				String host = req.getHeader("host");
				out.print("<p> O seu navegador é : " +host+ "</p>");
			
				String user = req.getHeader("user-agent");
				out.print("<p> O seu navegador é : " +user+ "</p>");
				
				String encoding = req.getHeader("accept-encoding");
				out.print("<p> Codificação aceita : " +encoding+ "</p>");
				
				String language = req.getHeader("accept-language");
				out.print("<p> Linguagem aceita : " +language+ "</p>");
				
	}
}
