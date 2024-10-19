<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MVC READ ALL</title>
</head>
<body>
<%@ include file="dashboard.jsp" %>
<br/>
<%@ page import="com.model.*,java.util.*" %>
	<table border="1">
		<tr>
			<th>UserName</th>
			<th>Password</th>
			
		</tr>
		<% 
		@SuppressWarnings("unchecked")
		List<Slogin> LD = (List<Slogin>)request.getAttribute("res2");
 
	    for(Slogin B : LD)
	    {%>
	        <tr>
	        	<td><%= B.getUsername() %></td>
	        	<td><%= B.getPassword() %></td>
	        	
	        </tr>
	    <%}%>
	</table>
</body>
</html>