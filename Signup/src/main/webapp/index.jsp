<!DOCTYPE html>
<html lang="en">
<head>
 <title>SignUp Form</title>
</head>
<body>
 <h2>SignUp Form</h2>
 <form action="./Signupservlet" method="post">
 <label for="firstname">First Name:</label><br>
 <input type="text" id="firstname" name="firstname" required><br><br>
 <label for="lastname">Last Name:</label><br>
 <input type="text" id="lastname" name="lastname" required><br><br>
 <label for="email">Email:</label><br>
 <input type="email" id="email" name="email" required><br><br>
 <label for="phone">Phone Number:</label><br>
 <input type="tel" id="phone" name="phone" required><br><br>
 <label for="address">Address:</label><br>
 <textarea id="address" name="address" required></textarea><br><br>
 <input type="submit" value="Sign Up">
 </form>
</body>
</html>
