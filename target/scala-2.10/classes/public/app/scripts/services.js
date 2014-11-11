var frontendServices = angular.module('frontendServices', ['ngResource']);

frontendServices.factory('User', ['$resource',
  function($resource){
    return $resource('/user/:publicId', {}, {
      query: {method:'GET', params:{publicId:''}}
    });
  }]);

frontendServices.factory('Club', ['$resource',
  function($resource){
    return $resource('club/:clubId', {}, {
      query: {method:'GET', params:{clubId:'1'}}
    });
  }]);

frontendServices.factory('UserRecipes', ['$resource',
  function($resource){
    return $resource('/user/:publicId/recipes', {}, {
      query: {method:'GET', params:{publicId:''}, isArray: true}
    });
  }]);

frontendServices.factory('Recipes', ['$resource',
  function($resource){
    return $resource('/user/recipes/:publicId', {}, {
      query: {method:'GET', params:{publicId:''}, isArray: true}
    });
  }]);

frontendServices.factory('Store', ['$resource',
  function($resource) {
    return $resource('/store', {}, {
      query: {method: 'GET', params: {}, isArray: true}
    });
  }]);

frontendServices.factory('UserData', ['User',
  function(User) {
      return User.query();
  }
]);

frontendServices.factory('RecipeData', ['Recipes',
  function(Recipes) {
      return Recipes.query();
  }
]);

frontendServices.factory('StoreData', ['Store',
  function(Store) {
    return Store.query();
  }
]);
