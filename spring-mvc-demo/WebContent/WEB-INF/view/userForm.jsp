<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
	<title> User Registration </title>
</head>

<body>

	<form:form action="processRegistration" modelAttribute="user">
		
			FirstName <form:input path="firstName"/> 
			<br> <br>
			
			lastName <form:input path="lastName"/>
			
			<br> <br>
			Email : <form:input path="email"/>
			
			<br> <br>
		
			<input  type="submit" value="Register" />	
						
	</form:form>


</body>

</html>