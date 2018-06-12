<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	
</head>
<body>
<form action="registrationaccount"   method ="post" modalAttribute="userdetails" onsubmit ="return registration()">
	
	<p>${message}</p>
	<h2 align="center">Create Your Account</h2>
	
	<div class="login">
	<table cellspacing="2" align="center" cellpadding="8" border="0">
	<tr>
	<td align="right">Enter Name :</td>
	<td><input type="text" id="name" name ="username" placeholder="Enter user here">
	<span id="nameError" style="color:red;display:block;"></span></td>
	</tr>
	
	
	<tr>
	<td align="right">Enter Password :</td>
	<td><input type="password" id="password" name ="password" placeholder="Enter Password here">
	<span id="passError" style="color:red;display:block;"></span></td>
	</tr>
	
	<tr>
	<td align="right">Enter Phonenumber:</td>
	<td><input type="text" id="phonenumber" name ="phone" placeholder="Enter Phonenumber here">
	<span id="phoneError" style="color:red;display:block;"></span></td>
	</tr>
	
	<tr>
	<td align="right">Enter Address:</td>
	<td><input type="text" id="address" name ="address" placeholder="Enter Address here">
	<span id="addressError" style="color:red;display:block;"></span></td>
	
	</tr>
	
	<tr>
	<td></td>
	<td>
	<input type="submit" value="Create Account"></td>
	</tr>
	</table>
	</div>
	
	
	</form>
</body>
<script src="<c:url value="/resources/javascript/registration.js"/>"></script>
</html>
