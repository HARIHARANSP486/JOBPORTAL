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
	top: 20%;
	left: 20%;
}

.hero-image {
	background-image: url("background.jpg");
	background-color: #cccccc;
	height: 650px;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	position: relative;
}

.hero-text {
	text-align: center;
	position: absolute;
	top: 30%;
	left: 70%;
	transform: translate(-50%, -50%);
	color: white;
}


form {
	display: inline-block;
}
</style>

<body>
<div class="hero-image">
<div style="padding-left:1200px;text-align:top;padding-top:10px;">
 <a href="login.html"><b>Logout</b></a>
 </div>
 <div class="hero-text">
	<div style="align:center; ">
		<form method="post" action="SearchJobServlet">
			<h3>List of Jobs in various companies and locations:</h3>
			<table>
				<thead>
					<tr>
						<th
							style="border: 6px solid #dddddd; text-align: left; padding: 12px;">VACANCYDEPT</th>
						<th
							style="border: 6px solid #dddddd; text-align: left; padding: 12px;">VACANCYDETAILS</th>
						<th
							style="border: 6px solid #dddddd; text-align: left; padding: 12px;">JOBLOCATION</th>
						<th
							style="border: 6px solid #dddddd; text-align: left; padding: 12px;">COMPANYNAME</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="JOBS" items="${JOBS}">
						<tr>
							<td
								style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${JOBS.vacancyDept}</td>
							<td
								style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${JOBS.vacancyDetails}</td>
							<td
								style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${JOBS.jobLocation }</td>
							<td
								style="border: 2px solid #dddddd; text-align: left; padding: 8px;">${JOBS.companyName }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</form>
		</div>
		</div>
		</div>
</body>
</html>