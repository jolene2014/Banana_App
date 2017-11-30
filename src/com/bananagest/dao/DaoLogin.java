package com.bananagest.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bananagest.model.LogIn;
import com.bananagest.util.DBConnection;






public class DaoLogin {

	

	public String authenticateUser(LogIn login1) 
{
		String userEmail=login1.getEmail();
		String userPassword=login1.getPassword();
		//String userType=login1.getType();
		
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		
		String userEmailDB="";
		String userPasswordDB="";
		String userTypeDB="";
		
		try
	{
			conn= DBConnection.createConnection(); //establishes connection
			st=conn.createStatement(); 
			rs= st.executeQuery("select userEmail,userPassword,userType from users where userEmail='"+userEmail+"'");
			
		
		while(rs.next())
			{ 
				userEmailDB=rs.getString("userEmail");
				userPasswordDB=rs.getString("userPassword");
				userTypeDB=rs.getString("UserType");

				
				
				if(userEmail.equals(userEmailDB)&&userPassword.equals(userPasswordDB))
				{
					return userTypeDB;
					
				}
				 
			}
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return "Datos de inicio de sesion inválidos";
			
	}
}

