package com.employeemanagement.model;

import java.sql.ResultSet;

public interface DAOService {
	public void connectDB();
	public boolean verifyCredentials(String email, String password);
	public void saveRegistration(String employeeId, String name, String address, String gender, String salary, String BirthDate);
	public ResultSet listAllRegistrations();
	public void DeleteReg(String employeeId);
}
