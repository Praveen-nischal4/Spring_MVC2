<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Detailed Record of Student :</h1>

<table border="2">
<tr> 
<td> RollNo </td>
<td> Name </td>
<td> HQuali </td>
<td> exp </td>
</tr>
<c:forEach items="${slist }" var="s">

<tr>
<td>${s.rollno } </td>
<td> ${s.name }</td>
<td> ${s.HQual }</td>
<td> ${s.exp }</td>
<td>

<a href="searchstu/${s.rollno}"> Edit</a>
<a href="delstu/${s.rollno}"> Delete</a>

 </td>
</tr>

</c:forEach>
</table>

</body>
</html>