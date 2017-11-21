package com.ejemploJDBC.controlador;

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
 * Servlet implementation class EjemploJDBCServlet
 */
@WebServlet("/EjemploJDBCServlet")
public class EjemploJDBCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemploJDBCServlet() {
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
		String url="jdbc:mysql://localhost:3306/prueba";
		String user="root";
		String password="admin1234";
		String SQL = "SELECT * FROM usuarios2";
		
		Connection conn;
		Statement st;
		ResultSet rsDatos;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = (Connection) DriverManager.getConnection(url,user,password);
			st = (Statement) conn.createStatement();
			rsDatos = st.executeQuery(SQL);
			while(rsDatos.next())
			{
				response.getWriter().append(rsDatos.getInt("idUsuarios")+"<br>");
				response.getWriter().append(rsDatos.getString("nombreUsuario")+"<br>");
				response.getWriter().append(rsDatos.getString("passwordUsuarios")+"<br>");
				response.getWriter().append(rsDatos.getString("email")+"<br>");

			}
			//CERRAR CONEXIO.get.
			conn.close();
			st.close();
			//ResultSet rsDatos;
			}
	
		catch(Exception e)
		{
			response.getWriter().append("EL Error Ocurrio en: "+e);
		}
	
	}

}
