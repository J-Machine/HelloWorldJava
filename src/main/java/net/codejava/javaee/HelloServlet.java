package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*String yourName = request.getParameter("yourName");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hello <b>" + yourName + "</b></h1>");
		writer.close();*/
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Server at: ").append(request.getContextPath());
		String yourName = request.getParameter("yourName");

		// Instanciando a person
		Person person = new Person();
		person.setName(yourName);
		person.setAge(17);
		
		request.setAttribute("person", person);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("welcome.jsp");
				dispatcher.forward(request, response);
	}
	
}
