<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Administration Dashboard</title>
	<!-- Link to Bootstrap CSS -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style type="text/css">
	body {
			background-image: url('https://www.thisisdmg.com/wp-content/uploads/2022/07/Ai-powered-Chatbot-2-scaled.jpg');
			background-repeat: no-repeat;
			background-size: cover;
			background-position: center center;
		}

		.navbar {
			background-color: #212121;
		}

		.navbar-brand {
			color: #f5f5f5;
			font-size: 24px;
			font-weight: bold;
			letter-spacing: 1px;
		}

		.nav-link {
			color: #f5f5f5 !important;
			font-size: 18px;
			font-weight: 500;
			letter-spacing: 0.5px;
			margin-left: 15px;
			margin-right: 15px;
		}

		.nav-link:hover {
			color: #ffc107 !important;
		}

		.container {
			display: flex;
			flex-direction: column;
			align-items: center;
			padding: 50px;
			box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
			margin-top: 50px;
			max-width: 800px;
			margin: 0 auto;
			height: 100vh;
			background-color: rgba(255, 255, 255, 0.8);
			border-radius: 10px;
		}

		.title {
			font-size: 36px;
			font-weight: bold;
			color: #212121;
			background-color: #f5f5f5;
			border-color: #bdbdbd;
			border-radius: 5px;
			transition: all 0.3s ease;
			cursor: pointer;
			text-align: center;
			padding: 15px;
			margin-top: 50px;
			margin-bottom: 30px;
			box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.2);
			width: 100%;
		}

		.subtitle {
			font-size: 20px;
			color: #212121;
			margin-bottom: 50px;
			text-align: center;
			width: 100%;
		}

		.btn {
			margin: 10px;
			padding: 10px 20px;
			font-size: 18px;
			font-weight: bold;
			color: #f5f5f5;
			background-color: #ffc107;
			border-color: #ffc107;
			border-radius: 5px;
			transition: all 0.3s ease;
			cursor: pointer;
		}

		.btn:hover {
			background-color: #ff9800;
			border-color: #ff9800;
		}
	</style>
</head>
<body>
	<!-- Navigation Bar -->
	<nav class="navbar navbar-expand-lg">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Administration Page</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav ml-auto">
					
					<li class="nav-item">
						<a class="nav-link" href="Insert.jsp">Insert Recharge</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="Update.jsp">Update Recharge</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="Delete.jsp">Delete Recharge</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="Display.jsp">User Details</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="NewFile.html">Log out</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	
	<!-- Link to Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>