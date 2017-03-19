angular.module('myApp', ['angularSoap'])
 
.factory("testService", ['$soap',function($soap){
    var base_url = "http://www.cooldomain.com/SoapTest/webservicedemo.asmx";
 
    return {
        HelloWorld: function(){
            return $soap.post(base_url,"HelloWorld");
        }
    }
}])
 
.controller('MainCtrl', function($scope, testService) {
 
  testService.HelloWorld().then(function(response){
    $scope.response = response;
  });
  
})