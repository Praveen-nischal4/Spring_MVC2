<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Student Details Saved :</h2>
<br>

<form:form action="${pageContext.request.contextPath}/updateStudent" method="POST">
<table>
<tr>
<td> Roll no </td>
<td><form:input path="rollno"/> </td>
</tr>

<tr>
<td> Name </td>
<td><form:input path="name"/> </td>
</tr>

<tr>
<td> HQual</td>
<td><form:input path="HQual"/> </td>
</tr>

<tr>
<td> Exp</td>
<td><form:input path="exp"/> </td>
</tr>

<tr>
<td colspan="2"> <input type="submit" value="update"/> </td>
</tr>
</table>

</form:form>



</body>
</html>