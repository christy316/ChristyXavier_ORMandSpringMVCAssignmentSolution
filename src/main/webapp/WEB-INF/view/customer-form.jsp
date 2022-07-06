<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	crossorigin="anonymous">

<title>Customer relationShip</title>
</head>
<body>
	<div class="container">
		<h3>CUSTOMER RELATIONSHIP MANAGEMENT</h3>
		<hr>


		<h6>Save Customer</h6>
		<br>
		<table>
			<tbody>
				<form
					action="/ChristyXavier_ORMandSpringMVCAssignmentSolution/customer/save"
					method="POST">
					<input type="hidden" name="customerId"
						value="${Customer.customerId}">


					<tr>
					<td>	<div class="form-group">Frist Name</div></td>
						<td><div class="form-group">:</div></td>
						<td>
							<div class="form-line">
								<input type="text" name="firstName"
									value="${Customer.firstName}" class="form-control mb-4 col-16"
									placeholder="FirstName">
							</div>
						</td>
					</tr>
					<tr>
						<td><div class="form-group">Last Name</div></td>
						<td><div class="form-group">:</div></td>
						<td><div class="form-line">
								<input type="text" name="lastName" value="${Customer.lastName}"
									class="form-control mb-4 col-16" placeholder="LastName">
							</div></td>
					</tr>

					<tr>
						<td><div class="form-group">Email</div></td>
						<td><div class="form-group">:</div></td>
						<td><div class="form-line">
								<input type="text" name="email" value="${Customer.email}"
									class="form-control mb-4 col-16" placeholder="Email">
							</div></td>
					</tr>
					<tr>
						<td>
							<button type="submit" class="btn btn-info col-12">Save</button>
						</td>
					</tr>
				</form>
			</tbody>
		</table>
		<hr>
		<a
			href="/ChristyXavier_ORMandSpringMVCAssignmentSolution/customer/list">Back
			to student list</a>
	</div>
</body>
</html>