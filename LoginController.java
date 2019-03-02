package com.sushovan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("I am implementing MVC Demo:"+"<br/>");
		
		String s1=request.getParameter("USERNAME");
		String s2=request.getParameter("PASSWORD");
		
		com.MVC.LoginCredential log=new com.MVC.LoginCredential();
		log.setUname(s1);
		log.setUpasswd(s2);
		
		if(log.checkLogin())
		{
			request.setAttribute("USERNAME",s1);
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request,response);
		}
		else
		{
			RequestDispatcher rs=request.getRequestDispatcher("faliure.jsp");
			rs.forward(request, response);
		}
	}
}
