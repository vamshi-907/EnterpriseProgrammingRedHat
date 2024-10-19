<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<script type="text/javascript">
function readAll() 
{
	        document.forms[0].action = "SloginList";
	        document.forms[0].submit();
}
function createNew() 
{
	 		document.forms[0].action = "SloginInseart";
	        document.forms[0].submit();
}
function searchUser() 
{
	        document.forms[0].action = "SloginSearch";
	        document.forms[0].submit();
}
function updateUser() 
{
	        document.forms[0].action = "SloginUpdate";
	        document.forms[0].submit();
}
function deleteUser() 
{
	        document.forms[0].action = "SloginDelete";
	        document.forms[0].submit();
}

</script>



</head>
<body>
<h1>Login Successfully.....</h1>
	<br/>
	<H3>THIS PAGE IS TO PERFORM CRUD OPERATIONS</H3>
	
<br/>

<form method ="get">
	USERNAME: <input type= "text" name = "username" size = 20 />
	<br/><br/>
	PASSWORD: <input type= "password" name = "password" size = 20 />
	<br/><br/>
	<input type="button" value = "Slogin List" size = 10  onclick= "return readAll()"/>
	<input type="button" value = "CREATE" size = 10 onclick= "return createNew()" />
	<input type="button" value = "SEARCH" size = 10  onclick="return searchUser()"/>
	<input type="button" value = "UPDATE" size = 10 onclick="return updateUser()"/>
	<input type="button" value = "DELETE" size = 10  onclick="return deleteUser()"/>
	<input type="reset" value = "CLEAR TEXTBOX VALUES" size = 15 />
	<br/>
	
	</form>



</body>
</html>