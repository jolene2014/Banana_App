
package com.bananagest.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bananagest.dao.DaoAdmin;
import com.bananagest.model.Admin;

/**
 * Servlet implementation class DataBaseConnectionServlet
 */
@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1 retrive parameters from /regsitro.jsp
		String txtUserName =request.getParameter("txtUserName");
		String txtUserSecondName =request.getParameter("txtUserSecondName");
		String txtUserLastName =request.getParameter("txtUserLastName");
		String txtUserSecondLastName =request.getParameter("txtUserSecondLastName");
		String txtCURP=request.getParameter("txtCURP");
		String txtSex=request.getParameter("txtSex");
		String txtUserBirthdate=request.getParameter("txtUserBirthdate");
		String txtUserPassword=request.getParameter("txtUserPassword");
		String txtUserEmail=request.getParameter("txtUserEmail");
		String txtUserPhoneNumber=request.getParameter("UserPhoneNumber");
		double userPhoneNumber=Double.parseDouble(txtUserPhoneNumber);
		String txtUserCellphoneNumber=request.getParameter("UserCellphoneNumber");
		double userCellphoneNumber=Double.parseDouble(txtUserCellphoneNumber);
		String txtEntryDate=request.getParameter("txtEntryDate");
		String txtUserType=request.getParameter("txtUserType");
		String txtUserPosition=request.getParameter("txtUserPosition");
			
		
		Admin addUser=new Admin();
		
		addUser.setUserName(txtUserName);
		addUser.setUserSecondName(txtUserSecondName);
		addUser.setUserLastname(txtUserLastName);
		addUser.setUserSecondLastname(txtUserSecondLastName);
		addUser.setCURP(txtCURP);
		addUser.setUserSex(txtSex);
		addUser.setUserBirthDate(txtUserBirthdate);
		addUser.setUserPassword(txtUserPassword);
		addUser.setUserEmail(txtUserEmail);
		addUser.setUserPhoneNumber(userPhoneNumber);
		addUser.setUserCellphoneNumber(userCellphoneNumber);
		addUser.setEntryDate(txtEntryDate);
		addUser.setUserType(txtUserType);
		addUser.setUserPosition(txtUserPosition);
		
		DaoAdmin dru= new DaoAdmin();
		
		dru.registerUserDAO(addUser);
		
	
		//dru.seeUsers();
		
		
	}

}
