<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Update Recharge Plan</title>

<!-- Add Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZEJGKyzvz7u0CwY1geoI/" crossorigin="anonymous">

<style>
  /* Add custom CSS here */
  body {
    background-color: #f2f2f2;
  }
  .container {
    max-width: 500px;
    margin: 0 auto;
    padding: 20px;
    background-color: #fff;
    border-radius: 5px;
    box-shadow: 0px 0px 10px #888888;
  }
  h2 {
    text-align: center;
    margin-top: 30px;
  }
  form {
    margin-top: 30px;
  }
  label {
    font-weight: bold;
  }
  .form-control {
    border-radius: 5px;
    box-shadow: none;
  }
  button[type="submit"] {
    background-color: #007bff;
    border-color: #007bff;
    color: #fff;
    padding: 10px 20px;
    border-radius: 5px;
    margin-top: 20px;
  }
  button[type="submit"]:hover,
  button[type="submit"]:focus {
    background-color: #0062cc;
    border-color: #005cbf;
  }
</style>

</head>
<body>
  <div class="container">
    <h2>Update Recharge Plan</h2>
    <form action="UpdateController" method="post">
      <div class="form-group">
        <label for="planId">Plan ID:</label>
        <input type="text" class="form-control" id="planId" name="planId" required>
      </div>
      <div class="form-group">
        <label for="planPrice">Plan Price:</label>
        <input type="number" class="form-control" id="planPrice" name="planPrice" required>
      </div>
      <button type="submit" class="btn btn-primary">Update Plan</button>
    </form>
  </div>

  <!-- Add Bootstrap JS -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZEJGKyzvz7u0CwY1geoI/" crossorigin="anonymous"></script>
</body>
</html>