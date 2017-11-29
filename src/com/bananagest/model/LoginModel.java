package com.bananagest.model;

public class LoginModel {
	 private String email;
     private String password;
     
		public String getNombre() 
		{
	        return email ;
	    }
		public void setEmail(String _email ) 
		{
			email  = _email ;
	    }
		
		public String getPassword () 
		{
	        return   password ;
	    }
		public void setPassword(String _password ) 
		{
			  password  = _password ;
	    }
		
		public boolean validateLogin(String _email, String _password)
		
		{
		    boolean isValid=false;
			if(_email.equals("admin@gmail.com") && _password.equals("12345"))
		{	
			//return true;
			isValid=true;
		}
		else	
		{
			isValid=false;
		     //return false;	
		}
		{
				return false;	
		}
}

}
