<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<style>           
.blue-button{
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',endColorstr='#188BC0',GradientType=0);
	padding:3px 5px;
	color:#fff;
	font-family:'Helvetica Neue',sans-serif;
	font-size:12px;
	border-radius:2px;
	-moz-border-radius:2px;
	-webkit-border-radius:4px;
	border:1px solid #1A87B9
}     
table {
  font-family: "Helvetica Neue", Helvetica, sans-serif;
   width: 50%;
}
th {
  background: SteelBlue;
  color: white;
}
 td,th{
                border: 1px solid gray;
                width: 25%;
                text-align: left;
                padding: 5px 10px;
            }
</style>
</head>
<body>
<form:form method="post" modelAttribute="student" action="//addStudent">
<table>
		<tr>
			<th colspan="2">Add Student</th>
		</tr>
		<tr>
		<form:hidden path="stdId" />
          <td><form:label path="stdCode">Student Code:</form:label></td>
          <td><form:input path="stdCode" size="30" maxlength="30"></form:input></td>
        </tr>
		<tr>
		  <td><form:label path="firstName">First Name:</form:label></td>
          <td><form:input path="firstName" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="middleName">Middle Name:</form:label></td>
          <td><form:input path="middleName" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="lastName">Last Name:</form:label></td>
          <td><form:input path="lastName" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="age">Age:</form:label></td>
          <td><form:input path="age" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="adress">Adress:</form:label></td>
          <td><form:input path="adress" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</br>
<h3>Student List</h3>
<c:if test="${!empty listOfStudents}">
	<table class="tg">
	<tr>
		<th width="80">Student Code</th>
		<th width="120">First Name</th>
		<th width="120">Middle Name</th>
		<th width="80">Last Name</th>
		<th width="120">Age</th>
		<th width="120">Adress</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listOfStudents}" var="student">
		<tr>
			<td>${student.stdCode}</td>
			<td>${student.firstName}</td>
			<td>${student.middleName}</td>
			<td>${student.lastName}</td>
			<td>${student.age}</td>
			<td>${student.adress}</td>
			<td><a href="<c:url value='/updateStudent/${student.stdId}' />" >Edit</a></td>
			<td><a href="<c:url value='/deleteStudent/${student.stdId}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
