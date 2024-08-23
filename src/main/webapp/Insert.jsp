<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Recharge</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZEJGKyzvz7u0CwY1geoI/" crossorigin="anonymous">
    <style>
        body {
            background-color: #f2f2f2;
        }
        form {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0px 0px 10px #888888;
            padding: 20px;
            margin: 20px auto;
            max-width: 500px;
        }
        label {
            font-weight: bold;
        }
        button[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
        }
    </style>
</head>
<body>
    <form action="InsertController">
        <div class="form-group">
            <label for="planId">Plan ID:</label>
            <input type="text" class="form-control" id="planId" name="planId">
        </div>
        <div class="form-group">
            <label for="provider">Provider:</label>
            <input type="text" class="form-control" id="provider" name="provider">
        </div>
        <div class="form-group">
            <label for="planName">Plan Name:</label>
            <input type="text" class="form-control" id="planName" name="planName">
        </div>
        <div class="form-group">
            <label for="planDetails">Plan Details:</label>
            <input type="text" class="form-control" id="planDetails" name="planDetails">
        </div>
        <div class="form-group">
            <label for="planPrice">Plan Price:</label>
            <input type="text" class="form-control" id="planPrice" name="planPrice">
        </div>
        <button type="submit" class="btn">Create Recharge</button>
    </form>
</body>
</html>