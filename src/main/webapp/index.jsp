<!DOCTYPE html>
<html>
<head>
	<title>Prueba 2 Stock Management</title>
	<script src="getAll.js">	</script>
</head>
<body onload="getAll()">
	<div align="center">
    	<h1>Lista de Articulos</h1>
        <table id="myTable" border="1"></table>
	</div>
	<h2></h2>
	<div align="center">
		<input type="button" value="Insertar Articulo" onclick="window.location.href='insertItem.jsp';">
		<input type="button" value="Modificar Articulo" onclick="getAll();"/>		
		<input type="button" value="Eliminar Articulo" onclick="getAll();"/>
	</div>
		
</body>
</html>