package oop.tourguide.servlet;
import oop.tourguide.model.User;
import oop.tourguide.service.*;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class AddUser
 */
@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUser() {
        super();
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException
    {
		doGet(request, response);
        try {

        	
        	response.setContentType("text/html");
        	
        	User user = new User();
        	
        	user.setFirstName(request.getParameter("fname"));
        	user.setLastName(request.getParameter("lname"));
        	user.setUserName(request.getParameter("uname"));
        	user.setAddress(request.getParameter("address"));
        	user.setMobile(request.getParameter("mobile"));
        	user.setEmail(request.getParameter("email"));
        	user.setPassword(request.getParameter("password"));
        
        	IUserService iUserService = new IUserServiceImp();
        	iUserService.addUser(user);
        	
        	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/Register.jsp");
        	dispatcher.forward(request, response);
        	
        	 response.sendRedirect(request.getContextPath() +"Login.jsp");
        	
        }
        catch (Exception e){
        	   e.printStackTrace();
        }
        
       
	}

}
