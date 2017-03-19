<!DOCTYPE html>
<html>
<head>
	<title>Prueba 2 Stock Management</title>
	<script>	
	function soapRequest(){
		var str='<soapenv:Envelope xmlns:soapenv='+
		'http://schemas.xmlsoap.org/soap/envelope/'+
		'xmlns:dian="http://diana.com/">'+
		'<soapenv:Header/>'+
		   '<soapenv:Body>'+
		   '<dian:getAllItemsRequest/>'+
		   '</soapenv:Body>'+
		'</soapenv:Envelope>';
		function createCORSRequest(method, url) {
			var xhr = new XMLHttpRequest();
			if ("withCredentials" in xhr) {
				xhr.open(method, url, true);
			}
			else if (typeof XDomainRequest != "undefined") {
				alert("CORS not supported");
				xhr = new XDomainRequest();
				xhr.open(method, url);
			}
			else {				
				console.log("CORS not supported");
				alert("CORS not supported"); 
				xhr = null; 
			}
			return xhr; 
		} 
		var xhr = createCORSRequest("GET", "http://localhost:8081/stockManagement/services/stockManagement?wsdl");
		if(!xhr){
			console.log("XHR issue");
			return;
		}
		xhr.onload = function (){
			var results = xhr.responseText;
			console.log(results);
		}
		xhr.setRequestHeader('Content-Type', 'text/xml');
		xhr.send(str);
		alert("A");
		var parser = new DOMParser();
		var xmlDoc = parser.parseFromString(xhr.responseText, "application/xml");
		alert("B");
		txt = "";
		items = xmlDoc.getElementsByTagName("item");
		alert("c");
		for (i = 0; i < items.length; i++) {
			alert("D");
		    txt += items[i].childNodes[0].nodeValue + "<br>";
		    alert("E");
		}
		//document.getElementById("item").innerHTML = txt;
		alert(txt);
	}
	</script>
</head>
<body>
	<h2>
		Welcome to the Stock Management Service - <a href="services">Available
			Services</a>
			
	</h2>
	<input type="button" value="Soap Request" onclick="soapRequest();"/>
</body>
</html>
