<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Delete Title Here</title>
	<style>
		body {
			font-family: Arial, sans-serif;
			background-color: #f2f2f2;
		}
		
		form {
			background-color: #fff;
			padding: 20px;
			margin: 20px auto;
			max-width: 600px;
			box-shadow: 0px 0px 10px rgba(0,0,0,0.2);
		}
		
		label {
			display: block;
			margin-bottom: 10px;
		}
		
		input[type="text"] {
			padding: 5px;
			border-radius: 5px;
			border: 1px solid #ccc;
			width: 100%;
		}
		
		button[type="submit"] {
		  padding: 10px 20px;
		  background-color: #ff0000; /* red color */
		  color: #fff;
		  border: none;
		  border-radius: 5px;
		  cursor: pointer;
		  font-size: 16px;
		  margin-top: 10px;
		}
		
		button[type="submit"]:hover {
		  background-color: #ff3333; /* lighter red color on hover */
		}

		h1 {
			text-align: center;
			margin-top: 50px;
		}
	</style>
</head>
<body>
	<h1>Delete Title Here</h1>
	<form action="DeleteController">
		<label>Plan ID<input type="text" name="planId"></label>
		<button type="submit" name="save">Delete Recharge</button>
	</form>
</body>
</html>