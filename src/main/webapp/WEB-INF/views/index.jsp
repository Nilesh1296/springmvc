<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href='<c:url value="/resources/css/main.css" />' rel="stylesheet">
 

<body>
<center>
  <form action="login" align="center" class="abc" method="post"  onsubmit="return validate()" >
       <p>${message}</p>
			<h1 align="center">Login page</h1>

			<p>Enter username:</p>
			<input type="text" name="username" id="username" placeholder="Enter username">
			<div id="unameError"></div>


			<p>Enter Password:</p>
			<input type="password" name="password" id="password" placeholder="Enter password">
			<div id="passError"></div>

			<div>
				<input type="submit" class="login" value="Login"><br>
			</div>
			<div>
				<button>
					<a href="registration">Registration</a>
				</button>
			</div>
		</form>
		</center>
</body>
<script src="<c:url value="/resources/javascript/login.js"/>"></script>
</html>