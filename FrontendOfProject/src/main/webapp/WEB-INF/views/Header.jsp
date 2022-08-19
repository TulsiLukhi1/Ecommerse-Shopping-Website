<%@page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>${pageinfo}-shoppingSite</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="Main.css">
<link rel="stylesheet"
	href="https://maxcdn.bootsrapcdn.com/bootsrap/3.3.7/css/bootsrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootsrapcdn.com/bootsrap/3.3.7/js/bootsrap.min.js"></script>


</head>

<body>
	<div class="container">
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">Fashion</a>
				</div>

				<ul class="nav navbar-nav">
					<li><a href="home" >Home</a></li>
					<li><a href="<c:url value='/login'/> ">Login</a></li>
					<li><a href="<c:url value='/register'/> ">Register</a></li>
					<li><a href="<c:url value='/contectus'/> ">Contact Us</a></li>
					<li><a href="<c:url value='/aboutus'/> ">About Us</a></li>
					<li><a href="<c:url value='/product'/> ">Manage Product</a></li>
					<li><a href="<c:url value='/category'/> ">Manage Category</a></li>
					<li><a href="<c:url value='/productDisplay'/> ">Product Catalog</a></li>
					<li><a href="<c:url value='/cart'/> ">Cart</a></li>
				</ul>
			</div>
		</nav>
	</div>
</body>
</html>