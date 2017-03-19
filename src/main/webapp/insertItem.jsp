
<!DOCTYPE html>
<html>
<link href="https://fonts.googleapis.com/css?family=Lobster" rel="stylesheet" type="text/css">
<style>
  .red-text {
    color: red;
  }

  h2 {
    font-family: Lobster, Monospace;
  }

  p {
    font-size: 16px;
    font-family: Monospace;
  }

  .thick-green-border {
    border-color: green;
    border-width: 10px;
    border-style: solid;
    border-radius: 50%;
  }
  .thin-border {
    border-color: black;
    border-width: 2px;
    border-style: solid;
  }
  .smaller-image {
    width: 100px;
  }
</style>
<head>
	<title>Prueba 2 Stock Management</title>
	<script src="insert.js">	</script>
</head>
<body >
        
    <h1 align="center" > Insertar Articulo</h1>
	<div align="center" class="container-fluid">
        <table class="thin-border">
            <tr>
                <td>Nombre:</td>
                <td><input type="text" id="nameItem"></td>
            </tr>
            <tr>
                <td>Codigo:</td>
                <td><input type="text" id="idItem"></td>
            </tr>
            <tr>
                <td>Descripcion:</td>
                <td><input type="text" id="descriptionItem"></td>
            </tr>
            <tr>
                <td>Cantidad:</td>
                <td><input type="text" id="amountItem"></td>
            </tr>
            <tr></tr>
            <tr></tr>
        </table>
        <h2></h2>
        <div align="center">        	
            <input type="button" value="Enviar" onclick="insertItem();"/>	
        </div>
    </div>
</body>
</html>