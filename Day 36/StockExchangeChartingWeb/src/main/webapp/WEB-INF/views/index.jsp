<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<a href = "user-home">Users</a>

<hr>
${message }
<hr>
<%-- <ol>
<c:forEach var="name" items="${list }">
<li><h3>${name }</h3></li>

</c:forEach>
</ol> --%>
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

</tr>


</c:forEach>

</table>
</body>
</html>
