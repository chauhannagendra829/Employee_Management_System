<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Registration page</title>
</head>
<body>
<h2>Create Registration</h2>

	<form action="saveReg" method="post">
	<pre>
		EmployeeId : <input type="text" name="employeeId"/>
		Name       : <input type="text" name="name"/>
		Address    : <textarea rows="5" cols="30" name="address"/></textArea>
		Gender     : <input type="radio" name="gender" value="male"><label for="male">Male</label><input type="radio" name="gender" value="female"><label for="female">Female</label>		
		Salary     : <input type="text" name="salary"/>
		BirthDate  : <input type="text" name="BirthDate"/>
		
		 <input type="submit" name="save"/>
	
	</pre>
	</form>
	
	<% 
	  if(request.getAttribute("msg")!=null){
		  out.println(request.getAttribute("msg"));
	  }
	
	
	%>

</body>
</html>