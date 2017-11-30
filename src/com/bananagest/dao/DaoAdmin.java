package com.bananagest.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bananagest.model.Admin;
import com.bananagest.model.Employee;
import com.bananagest.util.DBConnection;

public class DaoAdmin {

	

	public void registerUserDAO(Admin addUser) {
		Connection conn=null;
		Statement st=null;
		int iResultado=0;
		String userName=addUser.getUserName();
		String userSecondName=addUser.getUserSecondName();
		String userLastname=addUser.getUserLastname();
		String userSecondLastname=addUser.getUserSecondLastname();
		String CURP=addUser.getCURP();
		String userSex=addUser.getUserSex();
		String userBirthdate=addUser.getUserBirthDate();
		String userPassword=addUser.getUserPassword();
		String userEmail=addUser.getUserEmail();
		double userPhonenumber=addUser.getUserPhoneNumber();
		double userCellphoneNumber=addUser.getUserCellphoneNumber();;
		String entryDate=addUser.getEntryDate();
		String userType=addUser.getUserType();
		String userPosition=addUser.getUserPosition();
		
		try
			{
			conn=DBConnection.createConnection();//establishes the conection	
			st = conn.createStatement();
			iResultado=st.executeUpdate("INSERT INTO users (userName,userSecondName,userLastname,userSecondLastname,CURP,userSex,userBirthdate,userPassword,userEmail,userPhonenumber,userCellphoneNumber,entryDate,userType,userPosition)"
						+"values ('"+userName+"','"+userSecondName+"','"+userLastname+"','"
						+userSecondLastname+"','"+ CURP+"','"+ userSex+"','"+ userBirthdate+"','"
						+userPassword+"','"+userEmail+"',"+userPhonenumber+","+userCellphoneNumber+",'"
						+entryDate+"','"+userType+"','"+userPosition+"')");
				if (iResultado==1)
				{
					System.out.println("se añadio un registro");;
				}
				conn.close();
				st.close();
			}
			catch (Exception e)
			{
				System.out.println("The error was: "+e);
			}
		
	}
	
public static ArrayList<Employee> getUsers(){
	String sSQL="SELECT * FROM users";
	Connection conn=null;
	conn=DBConnection.createConnection();
	ArrayList<Employee> employeeList=new ArrayList<Employee>();
	try{
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery(sSQL);
		while (rs.next()){
		Employee employee=new Employee();
		employee.setIdusers(rs.getInt("idusers"));
		employee.setUserName(rs.getString("userName"));
		employee.setUserName(rs.getString("userSecondName"));
		employee.setUserName(rs.getString("userLastName"));
		employee.setUserName(rs.getString("userSecondLastname"));
		employee.setUserEmail(rs.getString("userEmail"));
		employee.setUserPhoneNumber(rs.getDouble("userPhoneNumber"));
		employee.setUserPosition(rs.getString("userPosition"));
		employeeList.add(employee);
		}
	}catch (SQLException e){
		e.printStackTrace();
	}
		return employeeList;
	}
	
	
	
	public void seeUsers(){
	String sSQL="SELECT * FROM users";
	//String sSQL="SELECT * FROM users";
	Connection conn=null;
	Statement st;
	ResultSet rsDatos;
	
	
	
	
	
	
	
	/*try
	{//declaramos variables y objetos
		conn=DBConnection.createConnection();
		st=conn.createStatement();
		rsDatos =st.executeQuery(sSQL);
		
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
	}*/
	
	}
	

}
