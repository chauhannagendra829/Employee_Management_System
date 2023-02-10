package com.employeemanagement.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
	
	Connection con;
	Statement stmnt;

	@Override
	public void connectDB() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeManagement", "root", "1234");
			stmnt= con.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Override
	public boolean verifyCredentials(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
			return result.next();
		
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return false;
	}
	

	@Override
	public void saveRegistration(String employeeId, String name, String address, String gender, String salary,
			String BirthDate) {
		try {
			stmnt.executeUpdate("insert into employee values('"+employeeId+"','"+name+"', '"+address+"','"+gender+"','"+salary+"', '"+BirthDate+"')");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public ResultSet listAllRegistrations() {
		try {
			ResultSet result = stmnt.executeQuery("select * from employee");
			return result;
			
		} catch (Exception e) {	
			e.printStackTrace();
		}		
		return null;
	}

	@Override
	public void DeleteReg(String employeeId) {
		try {
			stmnt.executeUpdate("Delete from employee where employeeId='"+employeeId+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
