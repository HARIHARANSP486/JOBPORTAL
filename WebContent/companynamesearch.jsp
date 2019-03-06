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
	top: 40%;
	left: 45%;
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
				<div align="center" style="width: 600px; padding-top:150px;">
					<form method="post" action="SearchJobCompany">
						<h2>Search job:</h2>
						<table>
							<tr>
								<td class="select"><b>Company Name :</b></td>
								<td><select name="companyName">
										<option value="CHAINSYS">CHAINSYS</option>
										<option value="AMAZON">AMAZON</option>
										<option value="ZOHO">ZOHO</option>
										<option value="CAPGEMINI">CAPGEMINI</option>
										<option value="GOOGLE">GOOGLE</option>
										<option value="FLIPKART">FLIPKART</option>
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