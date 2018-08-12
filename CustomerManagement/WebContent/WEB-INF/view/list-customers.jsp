
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>


	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>

 
	
	<div id="wrapper">
		<div id="header">
			<h2> Customer Management</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
			<!-- 
				Add customer
			 -->
			 	<input type="button"  value="Add Customer" onclick="window.location.href='addCustomerForm';return false" class="add-button"/>
		
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email </th>
					
				</tr>
				
					<c:forEach var="tempCustomers" items="${customers}">
						<tr>
							<td><c:out value="${tempCustomers.firstName}"/> </td>
							<td><c:out value="${tempCustomers.lastName}"/> </td>
							<td><a href="updateCustomer?customerId=${tempCustomers.id}"> <c:out value="${tempCustomers.email}"/></a> </td>
						</tr>
					</c:forEach>
					
			</table>
			 
		</div>
	</div>
	
</body>

</html>