<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
	crossorigin="anonymous"></script>
</head>
<style>
.id {
	text-align: center;
}

.centered {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}

.css {
	position: absolute;
	top: 50%;
	left: 50%;
	width: 400px;
	padding: 40px;
	transform: translate(-50%, -50%);
	background: linear-gradient(#006992, #2E1760);
	box-sizing: border-box;
	box-shadow: 0 15px 25px rgba(0, 0, 0, 6);
	border-radius: 10px;
	color: white;
}
</style>
<body>
	<div class="centered">
		<div class="id">
			<div class="css">
				<form action="AdminRegController">
					<h1>Registration Details</h1>
					<br>
					<br> Admin Name: <input type="text" class="form-control"
						name="adName" placeholder="Admin Name"><br>
				 Username: <input type="text" class="form-control"
						name="email" placeholder="Username"><br>
				 Password: <input type="text" class="form-control"
						name="password" placeholder="Pasword"><br>
				

					<button type="submit" class="btn btn-primary" name="save">Register</button>
					<br>
					<div class="text-center">
						<p>
							Already have an account? <a href="AdminLogin.jsp">Log in here</a>
						</p>
					</div>

				</form>
			</div>
		</div>
	</div>

</body>
</html>