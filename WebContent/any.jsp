<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

body {
	background-image: url("system-background.jpg");
	background-repeat: no-repeat;
	background-position: center center;
	text-align: center;
	padding-left: 350px;
	font-family: Times New Roman;
	font-size: 19px
}

form {
	display: inline-block;
}
</style>

<body>
<div style="padding-left: 890px">
		<a href="login.html">Logout</a>
	</div>
	<table>



		<tr>
			<td>
				<div align="center" style="width: 600px; padding-top: 150px;">
					<form method="post" action="OverallSearchServlet">
						<h2>Search job:</h2>
						<table>
							<tr>
								<td class="select"><b>Select user specification:</b></td>
								<td><select name="selectAny">
								<option value="B.E - Computer Science Engineering">B.E
											- Computer Science Engineering</option>
										<option value="B.E - Information Technology">B.E -
											Information Technology</option>
										<option
											value="B.E - Electronics and Communication Engineering">B.E
											- Electronics and Communication Engineering</option>
										<option value="B.E - Electrical and Electronics  Engineering">B.E
											- Electrical and Electronics Engineering</option>
										<option value="B.E - Mechanical Engineering">B.E -
											Mechanical Engineering</option>
										<option value="B.E-  Mining Engineering">B.E - Mining
											Engineering</option>
										<option value="B.E- Automobile Engineering">B.E -
											Automobile Engineering</option>
										<option value="B.E- Civil Engineering">B.E - Civil
											Engineering</option>
										<option value="B.E- OTHERS">B.E - Other Department</option>
										<option value="B.Sc- Computer Science">B.Sc -
											Computer Science</option>
										<option value="B.Sc- Information Technology">B.Sc -
											Information Technology</option>
										<option value="B.Sc- OTHERS">B.Sc - Others</option>
										<option value="M.Sc- Computer Science">M.Sc -
											Computer Science</option>
										<option value="M.Sc- Information Technology">M.Sc -
											Information Technology</option>
										<option value="M.Sc- OTHERS">M.sc - Others</option>
										<option value="B.C.A">B.C.A</option>
										<option value="M.C.A">M.C.A</option>
										<option value="OTHERS">OTHERS COURSES</option>
										<option value="CHAINSYS">CHAINSYS</option>
										<option value="AMAZON">AMAZON</option>
										<option value="ZOHO">ZOHO</option>
										<option value="CAPGEMINI">CAPGEMINI</option>
										<option value="GOOGLE">GOOGLE</option>
										<option value="FLIPKART">FLIPKART</option>
										<option value="CHENNAI">CHENNAI</option>
										<option value="COIMBATORE">COIMBATORE</option>
										<option value="MADURAI">MADURAI</option>
										<option value="THIRUNELVALI">THIRUNELELI</option>
										<option value="BANGALOERE">BANGALORE</option>
										<option value="HYDRABAD">HYDRABAD</option>
										<option value="PUNE">PUNE</option>
										<option value="MUMBAI">MUMBAI</option>
										<option value="FRONT END DEVELOPERS">FRONT END
											DEVELOPERS</option>
										<option value="BACK END DEVELOPERS">BACK END
											DEVELOPERS</option>
										<option value="JAVA PROGRAMMER">JAVA PROGRAMMER</option>
										<option value="FULL STACK DEVELOPERS">FULL STACK
											DEVELOPERS</option>
										<option value="SOFTWARE TESTING">SOFTWRAE TESTING</option>
										<option value="R & D DEPARTMENT">R AND D DEPARTMENT</option>
										<option value="BUSINESS DEVELOPMENT">BUSINESS
											DEVELOPMENT</option>
										<option value="HUMAN RESOURCES">HUMAN RESOURCES</option>
								</select></td>
								<td><button type="submit" style="width: 100px">
										<b>SUBMIT</b>
									</button> <br></td>
						</table>
					</form>
				</div>
			</td>
		</tr>
	</table>
</body>
</html>