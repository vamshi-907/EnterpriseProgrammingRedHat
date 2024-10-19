<!DOCTYPE html>
<html lang="en">
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Welcome, <%= request.getAttribute("firstname") %> <%= request.getAttribute("lastname") %>!</h2>
    <p>Your email: <%= request.getAttribute("email") %></p>
</body>
</html>
