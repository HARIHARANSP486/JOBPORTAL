<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.display {
	position: absolute;
	top: 25%;
	left: 10%;
}


body
{
	background-image: url("system-background.jpg") ;
	background-repeat:no-repeat;
	background-position: center center;
text-align: center;

padding-left:350px;
font-family: Times New Roman;
font-size: 19px
}


form {
	display: inline-block;
}

</style>
<body >

<div style="padding-left:890px">
 <a href="login.html">Logout</a>
 </div>
	<table>



		<tr>
			<td>
				<div align="center" style="width: 600px; padding-top: 150px">
					<form method="post" action="SearchJobServlet">
						<h2>Search job:</h2>
						<table>
							<tr>
								<td class="select"><b>DepartmentName :</b></td>
								<td ><select name="deptname" >
								<option value="B.E - Computer Science Engineering">B.E - Computer Science Engineering</option>
								<option value="B.E - Information Technology">B.E - Information Technology</option>
					<option value="B.E - Electronics and Communication Engineering">B.E - Electronics and Communication Engineering</option>
					<option value="B.E - Electrical and Electronics  Engineering">B.E - Electrical and Electronics  Engineering</option>
					<option value="B.E - Mechanical Engineering">B.E - Mechanical Engineering</option>
					<option value="B.E-  Mining Engineering">B.E - Mining Engineering</option>
					<option value="B.E- Automobile Engineering">B.E - Automobile Engineering</option>
					<option value="B.E- Civil Engineering">B.E - Civil Engineering</option>
					<option value="B.E- OTHERS">B.E - Other Department</option>
					<option value="B.Sc- Computer Science">B.Sc - Computer Science</option>
					<option value="B.Sc- Information Technology">B.Sc - Information Technology</option>
					<option value="B.Sc- OTHERS">B.Sc - Others</option>
					<option value="M.Sc- Computer Science">M.Sc - Computer Science</option>
					<option value="M.Sc- Information Technology">M.Sc - Information Technology</option>
					<option value="M.Sc- OTHERS">M.sc - Others</option>
					<option value="B.C.A">B.C.A</option>
					<option value="M.C.A">M.C.A</option>
					<option value="OTHERS">OTHERS COURSES</option>								
								
								
								
								
								</select></td>
								
								
							
					
					<td><button type="submit" style="width: 100px"><b>SUBMIT</b></button> <br></td>
				
						</table>
					</form>
				</div>
			</td>
		</tr>
</table>
</div>
</div>
</body>

</html>