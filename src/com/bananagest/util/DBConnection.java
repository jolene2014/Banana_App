package com.bananagest.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	
	public static Connection createConnection(){

	String sUrl="jdbc:mysql://localhost:3306/bananagest";
	String sUsername="root";
	String sPassword="All4you2_";
	Connection conn = null;
		
	try
	{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");//loadin mysql driver
			}
			
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			
			conn=DriverManager.getConnection(sUrl,sUsername,sPassword);
			System.out.println("printing connection object "+conn);
	}
	catch(Exception e)
	{
			e.printStackTrace();
	}
	return conn;
}}

