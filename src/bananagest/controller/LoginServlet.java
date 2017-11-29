package com.bananagest.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bananagest.dao.DaoLogin;
import com.bananagest.model.LogIn;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1 retirve all parameters from jsp page
		String txtUserEmail=request.getParameter("txtUserEmail");
		String txtUserPassword=request.getParameter("txtUserPassword");
		
		
		
		
		if (txtUserEmail.equals(null)||txtUserEmail==""||txtUserPassword.equals(null)||txtUserPassword=="")
		{
			request.setAttribute("msg", "Todos los campos son obligatorios");
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		} 
		else
		{
			//2 set all values in LogIn class model
			LogIn login1=new LogIn();
			
			login1.setEmail(txtUserEmail);
			login1.setPassword(txtUserPassword);
			
			DaoLogin loginDao=new DaoLogin();
			
			String userValidation=loginDao.authenticateUser(login1);
			System.out.println(userValidation);
			
			
			if (userValidation.equals("admin"))
			{
				request.setAttribute("txtUserEmail", txtUserEmail);
				request.getRequestDispatcher("registro.jsp").forward(request, response);
			}
			
			
			else if (userValidation.equals("manager"))
			{
				request.setAttribute("txtUserEmail", txtUserEmail);
				request.getRequestDispatcher("manager.jsp").forward(request, response);
			}
			
			else if(userValidation.equals("employee"))
			{
				request.setAttribute("txtUserEmail", txtUserEmail);				
				request.getRequestDispatcher("/employee.jsp").forward(request, response);
			}
			
			else
			{
				request.setAttribute("errMessage", userValidation);
				request.getRequestDispatcher("/index.jsp").forward(request, response);
			}
			
			
		}
	}

}
