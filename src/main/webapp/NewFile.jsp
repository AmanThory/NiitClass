<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form action="RegistrationAction" method="post">
 <p>  
   <input type="text" name="id" placeholder="id" />
   <input type="email" name="email" placeholder="email" required/>
   <input type="password" name="password" placeholder="Password" required/>
</p>
   <input type="submit" value="submit" />
</form>
</body>
</html>