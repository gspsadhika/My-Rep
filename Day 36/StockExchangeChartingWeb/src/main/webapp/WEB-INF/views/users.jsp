<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="userUrl" value="/user/save"></c:url>//if we use @RequestParam value='/remove? id=${user.id}'
<form:form action="${userUrl}" modelAttribute="user">

	<table>
	  	<tr>
			<td><form:label path="id">Id</form:label></td>
			<td><form:input path="id"/></td>
		</tr>
		<tr>
			<td><form:label path="fname">Firstname</form:label></td>
			<td><form:input path="fname"/></td>
		</tr>
		<tr>
			<td><form:label path="lname">Lastname</form:label></td>
			<td><form:input path="lname"/></td>
		</tr>
		<tr>
			<td><form:label path="uname">Username</form:label></td>
			<td><form:input path="uname"/></td>
		</tr>
		<tr>
			<td><form:label path="email">Email</form:label></td>
			<td><form:input path="email"/></td>
		</tr>
		 	<tr>
			<td><form:label path="rpwd">Password</form:label></td>
			<td><form:input path="rpwd"/></td>
		</tr>
		
		 	<tr>
			<td><form:label path="repwd">ReEnter</form:label></td>
			<td><form:input path="repwd"/></td>
		</tr>
		 	<tr>
			<td><form:label path="phone">Phone</form:label></td>
			<td><form:input path="phone"/></td>
		</tr>
		
		 	<tr>
			<td><form:label path="otp">OTP</form:label></td>
			<td><form:input path="otp"/></td>
		</tr>
		<tr>
			<td></td>
			<td><button type="submit">SUBMIT</button></td>
		</tr>
		
		
	</table>
</form:form>
<br>
<div>
<h3>UserDetails</h3>
<table border="1">
<tr>
<th>id</th>
<th>email</th>
<th>fname</th>
<th>lname</th>
<th>otp</th>
<th>phone</th>
<th>repwd</th>
<th>rpwd</th>
<th>uname</th>
<th>Actions</th>

</tr>
<c:forEach var="user" items="${list }">
<tr>

<td>${user.id }</td>
<td>${user.email }</td>
<td>${user.fname }</td>
<td>${user.lname }</td>

<td>${user.otp }</td>
<td>${user.phone }</td>
<td>${user.repwd }</td>
<td>${user.rpwd }</td>
<td>${user.uname }</td>
<td> <a href="<c:url value='/remove/${user.id }'/>" >Remove</a></td>
<td> <a href="<c:url value='/update/${user.id }'/>" >Update</a></td>

</tr>


</c:forEach>

</table>
</div>

</body>
</html>