<%@page import="rec.model.Payment"%>
<%@page import="rec.model.User"%>
<%@page import="rec.dao.RechargeDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import ="java.util.List"
			import ="rec.dao.RechargeDao"
			import ="rec.dao.RechargeDaoImpl"
			

    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
	<title>Insert title here</title>
	<style type="text/css">
		body {
    background-color: white;
}

table {
    background-color: #F5F5F5;
}

table th, table td {
    background-color: #ECEFF1;
    color: black;
}

.table-striped-columns tbody tr:nth-of-type(odd) {
    background-color: #FFFFFF;
}

.table-success {
    background-color: #A5D6A7;
}

	</style>
	
</head>
<body>
<form action="DisplayController">
	<h1>User Registration Details</h1>

	<table class="table table-success table-striped-columns">
		<thead>
			<tr>
				<th>Customer Name</th>
				<th>Mobile Number</th>
				<th>Email Id</th>
				<th>Password</th>
				
				<th>
			</tr>
			</thead>
		<tbody>
		
		<%
		RechargeDao rdao=new RechargeDaoImpl();
		List<User> lst=rdao.Display();
		for(User r:lst)
		{
		%>
			<tr>
				<td><%=r.getCustName() %></td>
				<td><%=r.getMobNo() %></td>
				<td><%=r.getEmail() %></td>
				<td><%=r.getPassword() %></td>
			</tr>
			<%} %>
			
		
		</tbody>
		</table>
		
		<h1>User Recharge Transaction</h1>
		<table class="table table-success table-striped-columns">
		<thead>
			<tr>
				<th>Card No</th>
				<th>Card Holder Name</th>
				<th>Expiry Date</th>
				<th>cvv</th>
				
				<th>
			</tr>
			</thead>
		<tbody>
		
		<%
		RechargeDao rdao1=new RechargeDaoImpl();
		List<Payment> lst1=rdao.Displayall();
		for(Payment U:lst1)
		{
		%>
			<tr>
				<td><%=U.getCardno() %></td>
				<td><%=U.getCardname() %></td>
				<td><%=U.getExpdate() %></td>
				<td><%=U.getCvv() %></td>
			</tr>
			<%} %>
			
		
		</tbody>
		</table>
	</form>
	<div class="d-grid gap-2 col-6 mx-auto">
  		<a href="AdminDashBoard.jsp" class="btn btn-primary">Admin Page</a>
	</div>
</body>
</html>