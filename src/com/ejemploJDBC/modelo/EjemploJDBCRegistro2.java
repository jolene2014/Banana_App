package com.ejemploJDBC.modelo;

import java.io.IOException;
import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class EjemploJDBCRegistro2
 */
@WebServlet("/EjemploJDBCRegistro2")
public class EjemploJDBCRegistro2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemploJDBCRegistro2() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String Url="jdbc:mysql://localhost:3306/prueba";
		String User = "root";
		String Pass = "admin1234";
		
		String txtIdUsuario = request.getParameter("txtIdUser");
		int iIdUsuario = Integer.parseInt(txtIdUsuario);
		String txtNombreUsuario = request.getParameter("txtUsername");
		String txtPasswordUsuario = request.getParameter("txtPassword");
		String txtEmailUsuario = request.getParameter("txtUserEmail");
		
		
		Connection conn;
		Statement st;
		int iResultado = 0;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = (Connection) DriverManager.getConnection(Url,User,Pass);
			st = (Statement) conn.createStatement();
			iResultado = 
					st.executeUpdate("INSERT INTO usuarios (idusuario,nombreUsuario,passwordUsuario,emailUsuario) values ("+iIdUsuario+",'"+txtNombreUsuario+"','"+txtPasswordUsuario+"','"+txtEmailUsuario+"')");
			
			if(iResultado==1)
			{
				response.getWriter().append("Registro Añadido");
			}
			conn.close();
			st.close();
		}
		catch(Exception e)
		{
			response.getWriter().append("El error fue:"+e);
		}
		
		
	}

}