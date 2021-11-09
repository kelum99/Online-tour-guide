<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="RegisterLogin.css"/>
<title>Register</title>
</head>
<body>

<header>
	<%@ include file="Header.jsp" %>
</header>
	
		<h1>Relax And Unwind</h1>
		<h2  class="sub-h2">Experience the luxurious level</h2>
	<div class="main-container-register"> 
		
		<form class="register-form" action="AddUser" method="post">
		
		<h2 style="text-align:center; border-bottom:2px solid white; margin-bottom:16px; font-size:32px;">Create Your Account</h2>	
			<div class="fields">
				<label >First Name</label>
				<input type="text" name="fname" placeholder="First Name" required>
			</div>
			
			<div class="fields">
				<label>Last Name</label>
				<input type="text" name="lname" placeholder="Last Name" required>
			</div>
			
			<div class="fields">
				<label>UserName</label>
				<input type="text" name="uname" placeholder="Username" required>
			</div>
			
			<div class="fields">
				<label>Address</label>
				<input type="text" name="address" placeholder="Address" style="width:250px; height:30px;" required>
			</div>
			
			<div class="fields">
				<label>Mobile Number</label>
				<input type="number" name="mobile" placeholder="07x-xxxxxxx" required>
			</div>
			
			<div class="fields">
				<label>Email</label>
				<input type="email" name="email" placeholder="abc@gmail.com" required>
			</div>
			
			<div class="fields">
				<label>Password</label>
				<input type="password" name="password" placeholder="Password" pattern="(?=.*\d).(?=.*[a-z]).(?=*.[A-Z]).{8,})" title="Must Contain at least 8 or More Characters" required>
			</div>
			
			<div class="fields">
				<label>Confirm Password</label>
				<input type="password" name="cpassword" placeholder="Password" pattern="(?=.*\d).(?=.*[a-z]).(?=*.[A-Z]).{8,})" title="Must Contain at least 8 or More Characters" required>
			</div>
			
			 <div class="reg-btn">
 				<input type="submit" name="submitbn"id="rgbtn" value="Submit" >
			</div>
			
		</form>
		
		
	</div>
	
	<footer>
	<%@ include file="Footer.jsp"%>
</footer>
	
</body>
</html>