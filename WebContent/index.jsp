<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>Banana Gest</title>	
		<link href="https://fonts.googleapis.com/css?family=Kanit" rel="stylesheet">	
		<link rel="stylesheet" type="text/css" href="font-awesome-4.7.0/css/font-awesome.css">
		<link rel="stylesheet" type="text/css" href="css/bootstrap4.css">
		<link rel="stylesheet" type="text/css" href="css/styles.css">
	</head>

	<body>
		
		<header class="header">
			<a href="index.html" style="color:black; font-weight:bold">
				<h1 class="navbar-brand">Banana<span>Gest</span></h1>
			</a>
			
		</header>

		<div class="container" style="margin-top:10px; margin-bottom:10px">
			<div class="text-center col-xs-12 col-md-6" style="float:left">
				<img src="images/banana_logo.png" class="img-fluid text-center" style="width:300px; margin-top:10px">
			</div>
			<div class="jumbotron text-center col-xs-12 col-md-6" style="float:left; margin-top:10px">
				<form action="LoginServlet" method="GET" id="frmlogin">
  				<div class="form-group">
    				<label for="emailUsuario">Email de Usuario:</label>
    				<input type="email" class="form-control" id="emailUsuario" aria-describedby="emailHelp" placeholder="Introduce tu correo">
  				</div>
  				<div class="form-group">
    				<label for="passwordUsuario">Contraseña:</label>
    				<input type="password" class="form-control" id="passwordUsuario" placeholder="Introduce tu contraseña">
  				</div>
				  <button type="submit" class="btn btn-success">Entrar</button>
				</form>
			</div>	
		</div>
	
		<footer class="footer text-center">			
			<div>				
				<a href="#" target="_blank">					
					<i class="fa fa-twitter fa-2x" aria-hidden="true"></i>				
				</a>				
				<a href="#" target="_blank">					
					<i class="fa fa-facebook-official fa-2x" aria-hidden="true"></i>				
				</a>				
				<a href="#" target="_blank">					
					<i class="fa fa-linkedin-square fa-2x" aria-hidden="true"></i>				
				</a>			
			</div>		
		</footer>
	</body>
</html>