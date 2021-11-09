<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="oop.tourguide.util.*"%>
     <%@page import="oop.tourguide.service.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" media="screen" href="RegisterLogin.css"/>
<title>Login</title>
</head>
<body>
	<header>
		<%@ include file="Header.jsp" %>
	</header>
	
		
		  <form name="loginform" action="UserLogin" method="post">
       <div class="login-container">
         <div>   <h2>Login</h2> </div>
            
        <div class="textbox">
                <img  src="Images/user.png"  class="icon1">
               <input type="text" name="username" class="text1" id="uname" placeholder="Username" autocomplete="off" required> 
            </div>

            <div class="textbox">
               <img src="Images/lock.png" class="icon1">
               <input type="password" name="pswrd" class="text1" id="psw" placeholder="Password"  title="Must Contain at least 8 or More Characters" required> 
            </div>
        
        <div class="btnlog">
            <input type="submit" value="Login" name="submit" >
        </div>

         <div class="signin">
           <p>Not Registered? <a href="signUp.html">Create An Account</a> </p>
        </div>

            </div>
        </form>
	
	
	<footer>
		<%@ include file="Footer.jsp"%>
	</footer>
</body>
</html>