package com.bananagest.servlet;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("hola gorda ");
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();
		String url = "jdbc:mysql://127.0.0.1:3306/prueba";
		String username = "root";
		String password = "All4you2_";
		
		String usuarioIntroducido = request.getParameter("emailUsuario");
		String passwordIntroducido = request.getParameter("passwordUsuario");
		
		try
		{
			//Instanciamos el conector
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			//Creamos la conexion
			conn = (Connection) DriverManager.getConnection(url,username,password);
			st = (Statement) conn.createStatement();
			rs = st.executeQuery("SELECT * FROM usuarios WHERE nombreUsuario='"+ usuarioIntroducido+"' and passwordUsuario='"+passwordIntroducido+"';");
			
			if(rs == null)
			{
				//response.getWriter().append("Resultset está vacio");	
				response.sendRedirect("index.jsp");
			}
			else
			{
				//rs.next();
				response.sendRedirect("usuario.jsp");
			
			}
			if (rs = admin)
			{
				response.sendRedirect("");
			}
			if (rs = manager)
			{
				response.sendRedirect("");
				
			}
				conn.close();
			}
		
			catch (Exception e)
			{
				response.getWriter().append("conexion fallida. Exception:"+ e);
			}
		
		
	}
				

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
