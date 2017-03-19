App.factory('Item', ['$resource', function ($resource) {
    //$resource() function returns an object of resource class
    return $resource(
            'http://localhost:8081/wsdlfirstws/services/stockManagement', 
            {id: '@id'},
            {
                update: {
                      method: 'PUT' // To send the HTTP Put request when calling this custom update method.
                }
                 
            }
    );
}]);