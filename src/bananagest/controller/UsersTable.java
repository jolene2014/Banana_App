package com.bananagest.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bananagest.dao.DaoAdmin;
import com.bananagest.model.Employee;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

/**
 * Servlet implementation class UsersTable
 */
@WebServlet("/UsersTable")
public class UsersTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Employee> employee=new ArrayList<Employee>();
		employee=DaoAdmin.getUsers();
		Gson gson=new Gson();
		JsonElement element=gson.toJsonTree(employee, new TypeToken<List<Employee>>(){}.getClass());
		
		//JsonArray jsonA
	}

}
