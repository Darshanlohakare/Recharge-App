<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Credit/Debit Card Details</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<!-- Custom CSS -->
<style>
.card-form {
	max-width: 500px;
	margin: auto;
}

.card-form .form-group {
	margin-bottom: 15px;
}

.card-form label {
	font-weight: bold;
}

.card-form input[type="text"], .card-form input[type="number"],
	.card-form select {
	border: 1px solid #ced4da;
	padding: 5px 10px;
	border-radius: 3px;
	width: 100%;
}

.card-form button[type="submit"] {
	background-color: #007bff;
	color: #fff;
	padding: 8px 15px;
	border: none;
	border-radius: 3px;
	cursor: pointer;
}
</style>
</head>
<body>
	<div class="container">
		<div class="card-form">
			<form action="PaymentController">
				<div class="form-group">
					<label for="cardNumber">Card Number:</label> <input type="text"
						class="form-control" name="cardno" placeholder="Enter Card Number"
						required>
				</div>
				<div class="form-group">
					<label for="cardHolder">Card Holder Name:</label> <input
						type="text" class="form-control" name="cardname"
						placeholder="Enter Card Holder Name" required>
				</div>
				<div class="form-group">
					<label for="expiryMonth">Expiration Date:</label> <input
						type="text" class="form-control" name="expdate"
						placeholder="Enter Expiry date" required>
				</div>
				<!--  <div class="form-group">
							<label for="cvv">CVV:</label>
							<input type="number" class="form-control" name="cvv" placeholder="Enter CVV" required>
							</div>-->
				<div class="form-group">
					<label for="cvv">CVV:</label> <input type="password"
						class="form-control" name="cvv" placeholder="Enter CVV" required
						oninput="this.value=this.value.replace(/[^0-9]/g,'').replace(/(\d{1})(\d{1})(\d{1})(\d{1})(\d{1})/g,'$1$2$3$4*')">
				</div>

				<button type="submit" class="btn btn-primary" >Submit</button>
				
			</form>
		</div>
	</div>
	<!-- Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
		
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
		
		

</body>
</html>

</body>
</html>