

<html>
<head>

<script type="text/javascript">
function callValidate() 
{
	        document.forms[0].action = "SloginServletEx";
	        document.forms[0].submit();
}

</script>

</head>

<body>

<h2>Welcome to LOGIN PAGE!!!!</h2>

		<form action="" method ="post">
		Enter the User Name and Password:
		<br/>
		<br/>
		User Name: <input type ="text" name ="username" size = 20 />	
		<br/>
		<br/>
		Password <input type ="password" name ="password" size = 20 />	
		<br/>
		<br/>	
		<input type = "button" onclick="return callValidate()" value = "Login" /> 
		<input type = "reset" value = "Reset" />
		</form>
</body>
</html>
