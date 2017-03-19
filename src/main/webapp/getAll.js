function createCORSRequest(method, url) {
	var xhr = new XMLHttpRequest();
	if ("withCredentials" in xhr) {
		xhr.open(method, url, false);
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
function getAll(){
	var str='<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:dian="http://diana.com/">'+
	'<soapenv:Header/>'+
	   '<soapenv:Body>'+
	   '<dian:getAllItemsRequest/>'+
	   '</soapenv:Body>'+
	'</soapenv:Envelope>';			 
	var xhr = createCORSRequest("POST", "http://localhost:8081/stockManagement/services/stockManagement?wsdl");
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
	fillTable();
	
	function fillTable(){
        var parser = new DOMParser();
		var xmlDoc = parser.parseFromString(xhr.responseText, "application/xml");
		txt = "<th>Index</th><th>Cod. Art.</th><th>Nombre Art.</th><th>Desc. Art</th><th>Cant Art.</th>";
		var items = xmlDoc.getElementsByTagName("item");
		for (var i=0; i<items.length; i++){
	    	txt+="<tr><td>"+items[i].childNodes[0].firstChild.nodeValue;
	    	txt+="</td><td>"+items[i].childNodes[1].firstChild.nodeValue;
	    	txt+="</td><td>"+items[i].childNodes[2].firstChild.nodeValue;
	    	txt+="</td><td>"+items[i].childNodes[3].firstChild.nodeValue;
	    	txt+="</td><td>"+items[i].childNodes[4].firstChild.nodeValue;
	    	txt+="</td></tr>";
	    }
		
		document.getElementById("myTable").innerHTML = txt;
	}	
}
