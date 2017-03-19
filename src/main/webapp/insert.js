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
function insert(id , name , description , amount){
	alert("ingreso");
	alert(typeof id);
	alert(id);
	var str='<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:dian="http://diana.com/">'+
		'<soapenv:Header/>'+
		   '<soapenv:Body>'+
	      '<dian:insertItemRequest>'+
	         '<idItem>';
	str = str.replace(/^\s+|\s+$/g,"");
	alert(typeof str);
	alert(str);
	str +=id;
	alert(typeof str);
	alert(str);
	str+="</idItem>";
	alert(typeof str);
	alert(str);
	/*
	str +=id+'</idItem>'+
	         '<nameItem>'+name+'</nameItem>'+
	         '<descriptionItem>'+description+'</descriptionItem>'+
	         '<amountItem>'amount+'</amountItem>'+
	      '</dian:insertItemRequest>'
	      '</soapenv:Body>'+
	  	'</soapenv:Envelope>';	
	alert(str);
	/*
	var xhr = createCORSRequest("POST", "http://localhost:8081/stockManagement/services/stockManagement?wsdl");
	alert("corsrequest");
	if(!xhr){
		console.log("XHR issue");
		return;
	}
	alert("issue");
	xhr.onload = function (){
		
		var results = xhr.responseText;
		console.log(results);
	}
	alert("result");
	xhr.setRequestHeader('Content-Type', 'text/xml');
	alert("header");
	xhr.send(str);		
	alert("send");
	//readResponse();
	
	function readResponse(){
        var parser = new DOMParser();
		var xmlDoc = parser.parseFromString(xhr.responseText, "application/xml");
		var result = xmlDoc.getElementsByTagName("result");
		alert("RESULT"+result.nodeName+":"+result.firstChild.nodeValue);
	}*/
}
function insertItem(){
	var id = document.getElementById("idItem").value;
	var name=document.getElementById("nameItem").value;
	var description=document.getElementById("descriptionItem").value;
	var amount=document.getElementById("amountItem").value;
	insert(id , name , description , amount);
}