package com.employeemanagement.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeemanagement.model.DAOService;
import com.employeemanagement.model.DAOServiceImpl;
@WebServlet("/saveReg")
public class SaveRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    public SaveRegistrationController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/create_registration.jsp");
		rd.forward(request, response);	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String employeeId =request.getParameter("employeeId");		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		String salary = request.getParameter("salary");
		String birthDate = request.getParameter("BirthDate");
		
		DAOService service =new DAOServiceImpl();
		service.connectDB();
		service.saveRegistration(employeeId, name, address, gender, salary, birthDate);
		request.setAttribute("msg", "Record is saved");
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/create_registration.jsp");
				rd.forward(request, response);
	}

}