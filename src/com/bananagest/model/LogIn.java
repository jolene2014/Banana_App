package com.bananagest.model;


public class LogIn {
	private String email;
	private String password;
	private String type;	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	/*public void LoginUser()
	{
		String sSQL="select userEmail,userPassword,userType where userEmail="+email;
		Connection conn=null;
		Statement st;
		ResultSet rsDatos;
		
		
		try
			{
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				DBConnection.createConnection();
				//conn=DriverManager.getConnection(sUrl,sUsername,sPassword);
				st=conn.createStatement();
				rsDatos=st.executeQuery(sSQL);
				
		while (rsDatos.next())
		{	
				conn.close();
				st.close();
				
			}
			}
		catch (Exception e)
			{
				System.out.println("The error was: "+e);
			}
	}*/


}
