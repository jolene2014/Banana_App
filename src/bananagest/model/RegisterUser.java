package com.bananagest.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;




/*public class RegisterUser {
	String sUrl="jdbc:mysql://localhost:3306/bananagest";
	String sUsername="root";
	String sPassword="All4you2_";
	Connection conn = null;
	*/
	
	
	
	
	/*public void insertTupla2(String name, int number){
		Connection conn;
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//System.out.println( "la instancia se creo correctamente");
			conn=DriverManager.getConnection(sUrl,sUsername,sPassword);

		//conn.setAutoCommit(false);
			Statement stmtSentenciaSQL = conn.createStatement();
			
			stmtSentenciaSQL.executeUpdate("INSERT INTO temp (name, number) values ('"+name+"',"+number+")");
			
			
			conn.close();
			stmtSentenciaSQL.close();
			
		}
	
	catch (Exception e)
		{
			System.out.println("The error was: "+e);
		}
		
	}*/
	
	
	/*public void seeTuplas()
	{
		
		String sSQL="SELECT * FROM users";
		//String sSQL="SELECT * FROM users";
		Connection conn;
		Statement st;
		ResultSet rsDatos;
		
		try
		{//declaramos variables y objetos
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn=(Connection) DriverManager.getConnection(sUrl,sUsername,sPassword);
			st=(Statement) conn.createStatement();
			rsDatos=st.executeQuery(sSQL);
			
			while(rsDatos.next())
			{
				//System.out.println(rsDatos.getString("name"));
				//System.out.println(rsDatos.getInt("number"));
				
				System.out.println(rsDatos.getInt("idusers"));
				System.out.println(rsDatos.getString("userName"));
				System.out.println(rsDatos.getString("userPassword"));
				
			}
			//cerramos conexión
			conn.close();
			st.close();
			rsDatos.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println("El Error es: "+ e);
		}
	}
}*/
