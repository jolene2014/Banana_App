<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Banana Guest</title>	
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
			<nav class="nav float-right">			
				<a class="nav-link active" href="registro.html">Register</a>
			</nav>
		</header>

		<div class="container jumbotron" style="margin-top:10px">
			<form action="RegisterUserServlet" method="post">
				<div class="form-group">
			
	    		<label for="txtUserName">Name:</label>
	    		
	    		<input type="text" class="form-control" name="txtUserName" placeholder="First Name">
	    		<input type="text" class="form-control" name="txtUserSecondName" placeholder="Second Name">
	    		<input type="text" class="form-control" name="txtUserLastName" placeholder="1st Last Name">
	    		<input type="text" class="form-control" name="txtUserSecondLastName" placeholder="2nd Last Name">
	  		</div>
	  	
	  	
	  		<div class="form-group">
	    		<label for="txtUserPassword">Password:</label>
	    		<input type="password" class="form-control" name="txtUserPassword" placeholder="Insert your password">
	  		</div>
	  	
	  	
	  		<div class="form-group">
	    		<label for="txtCURP">CURP:</label>
	    		<input type="text" class="form-control" name="txtCURP" placeholder="Insert your CURP">
	    		<label for="txtSex">Sexo:</label>
	    		<select class="form-control" name="txtSex" placeholder="Sex">
	    			<option>M</option>
	    			<option>F</option>
	    			<option>I</option>
	    		</select>
	    		<label for="txtUserBirthdate">Birth Date:</label>
	    		<input type="text" class="form-control" name="txtUserBirthdate" placeholder="yyyy-mm-dd" required>
	    		<label for="txtUserEmail">Email:</label>
	    		<input type="text" class="form-control" name="txtUserEmail" placeholder="Insert your Email">
	    		<label for="txtPhoneNumber">Phone Number:</label>
	    		<input type="text" class="form-control" name="UserPhoneNumber" placeholder="Phone Number">
	    		<label for="txtCellphoneNumber">Cellphone Number:</label>
	    		<input type="text" class="form-control" name="UserCellphoneNumber" placeholder="Cellphone Number">
	    		<label for="txtEntryDate">Entry Date:</label>
	    		<input type="text" class="form-control" name="txtEntryDate" placeholder="yyyy-mm-dd">
	    		<label for="txtUserType">User Type:</label>
	    		<select class="form-control" id="txtUserType">
	    			<option>Admin</option>
	    			<option>Manager</option>
	    			<option>Employee</option>
	    		</select>
	    		<label for="txtUserPosition">User Position:</label>
	    		<select class="form-control" name="txtUserPosition">
	    			<option>Developer</option>
	    			<option>Project Manager</option>
	    			<option>RH</option>
	    			<option>CEO</option>
	    			<option>Owner</option>
	    		</select>

	  		</div>
	  		<input type="submit" value="Agregar Registro">
	  		</div>
	  	</form>
	  	
	  	
		</div>

		<footer class="footer text-center">			
			<div>				
				<a href="#" target="_blank">					
					<i class="fa fa-twitter fa-2x" aria-hidden="true"></i>				
				</a>				
				<a href="https://www.facebook.com" target="_blank">					
					<i class="fa fa-facebook-official fa-2x" aria-hidden="true"></i>				
				</a>				
				<a href="#" target="_blank">					
					<i class="fa fa-linkedin-square fa-2x" aria-hidden="true"></i>				
				</a>			
			</div>		
		</footer>
	</body>
</html>