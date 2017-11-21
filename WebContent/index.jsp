<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/style.css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Consulta los datos del usuario</h1>

<form id="frmDatosUsuario" action="EjemploJDBCServlet" method="post">
<input id="Acepta" type="submit" Value="Consulta Registros"/>
</form>

<h1>Introduce los datos del usuario</h1>
<form id="frmIntroduce" action="EjemploJDBCRegistro2" method="post">
<label>Input the User Id:</label>
<input type="text" name="txtIdUser" />
<br/>
<label>Input the Username:</label>
<input type="text" name="txtUsername" />
<br/>
<label>Input the Password of the user:</label>
<input  type="Password" name="txtPassword" />
<br/>
<label>Input the user email:</label>
<input  type="text" name="txtUserEmail" />
<br/>
<input id="GuardaR" type="submit" value="Agregar Registro"/>
</form>
</body>

<script src="js/script.js"></script>
</html>