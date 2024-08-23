<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>User Dashboard</title>
	<!-- Link to Bootstrap CSS -->
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
	<nav class="navbar navbar-expand-lg custom-navbar">
    <div class="container-fluid">
        <a class="navbar-brand custom-brand" href="#">User Page</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto custom-nav">
                <li class="nav-item">
                    <a class="nav-link custom-link" href="Plans.jsp">Recharge Plans</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link custom-link" href="NewFile.html">Log out</a>
                </li>
            </ul>
        </div>
    </div>
</nav> 

</body>
</html>