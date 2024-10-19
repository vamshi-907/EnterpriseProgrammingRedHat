<!DOCTYPE html>
<html lang="en">
<head>
<title>Login</title>
</head>
<body>
	<h2>Login</h2>
	<form action="./LoginServlet" method="post">
		<label for="firstname">First Name:</label><br> <input
			type="firstname" id="firstname" name="firstname" required><br>
		<br> <label for="lastname">Last Name:</label><br> <input
			type="lastname" id="lastname" name="lastname" required><br>
		<br> <label for="email">Email:</label><br> <input
			type="email" id="email" name="email" required><br>
		<br> <input type="submit" value="Login">
	</form>
	<%
	String error = request.getParameter("error");
	if (error != null) {
	%>
	<p style="color: red;"><%=error%></p>
	<%
	}
	%>
</body>
</html>
