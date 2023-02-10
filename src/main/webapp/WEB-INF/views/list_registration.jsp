<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>

<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Number Of Employees</h2>
	<table border=1>
	  
		<thead>
		  	<tr>
		  		<th>EmployeeId</th>		  	
		  		<th>Name</th>
		  		<th>Address</th>
		  		<th>Gender</th>		  		
		  		<th>Salary</th>
		  		<th>BirthDate</th>	 
		  		<th>Delete</th> 		
		  			
		  	
		  	</tr>			  
		</thead>
		
		<%
		ResultSet res =(ResultSet) request.getAttribute("result");
		while(res.next()){%>
		<tbody>
		 <tr>
		     <td><%=res.getString(1)%></td>
		     <td><%=res.getString(2)%></td>
		     <td><%=res.getString(3)%></td>
		     <td><%=res.getString(4)%></td>
		     <td><%=res.getString(5)%></td>
		     <td><%=res.getString(6)%></td>
		     
		     
		     
		     <td><a href="delete?employeeId=<%=res.getString(1)%>">delete</a></td>
		     </tr>
		     </tbody>		     
			
		<% }%>	
			
	</table>

</body>
</html>