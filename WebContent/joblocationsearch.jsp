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
font-size: 22px
}


form {
	display: inline-block;
}

</style>
<body>
<div style="padding-left:890px">
 <a href="login.html">Logout</a>
 </div>
	<table>



		<tr>
			<td>
				<div align="center" style="width: 600px; padding-top:150px">
					<form method="post" action="SearchJoblocationServlet">
						<h2>Search job:</h2>
						<table>
							<tr>
								<td class="select"><b>Job Location :</b></td>
								<td><select name="joblocation">
										<option value="CHENNAI">CHENNAI</option>
										<option value="COIMBATORE">COIMBATORE</option>
										<option value="MADURAI">MADURAI</option>
										<option value="THIRUNELVALI">THIRUNELELI</option>
										<option value="BANGALOERE">BANGALORE</option>
										<option value="HYDRABAD">HYDRABAD</option>
										<option value="PUNE">PUNE</option>
										<option value="MUMBAI">MUMBAI</option>
								</select></td>
								<td><button type="submit" style="width: 100px"><b>SUBMIT</b></button>
									<br></td>
						</table>
					</form>
				</div>
			</td>
		</tr>
	</table>
</body>
</html>