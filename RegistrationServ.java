import java.io.PrintWriter;

import java.io.IOException;
//import jakarta.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServ
 */
@WebServlet("/RegistrationServ")
public class RegistrationServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegistrationServ() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zipcode = request.getParameter("zipcode");
		String country = request.getParameter("country");
		String phone = request.getParameter("phone number");
		String email = request.getParameter("email");
		String blood = request.getParameter("blood type");
		
		out.print("<h1>Blood Donor Registration Form</h1>");
		out.print("Name: " + name + "</br> Street Address: " + address + "</br> City: " + city + "</br> State: " + 
		state + "</br> Zipcode: " + zipcode + "</br> Country: " + country + "</br> Phone Number: " + 
				phone + "</br> Email: " + email + "</br> Blood Type: " + blood);
				
		
		
	}

}
