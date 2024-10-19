<!DOCTYPE html>
<html lang="en">
<head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <title>SignUp Result</title>
</head>
<body>
<h2>SignUp Details</h2>
<p>First Name: <%= request.getAttribute("firstname") %></p>
<p>Last Name: <%= request.getAttribute("lastname") %></p>
<p>Email: <%= request.getAttribute("email") %></p>
<p>Phone Number: <%= request.getAttribute("phone") %></p>
<p>Address: <%= request.getAttribute("address") %></p>
</body>
</html>
