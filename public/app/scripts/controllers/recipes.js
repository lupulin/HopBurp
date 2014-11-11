'use strict';

angular.module('frontendApp')
  .controller('RecipesCtrl', function ($scope, $location, Recipes, $modal) {

    $scope.recipes = Recipes.query();

  	$scope.recipe = function (publicId) {
  		$location.path("/recipe/"+publicId);
  	}

    $scope.open = function () {

      var modalInstance = $modal.open({
        templateUrl: 'newRecipeModal.html',
        controller: NewRecipeModalCtrl,
        size: 'lg',
      });

      modalInstance.result.then(function (selectedItem) {
        $scope.recipes.push(selectedItem);
      });
    };

  });

  var NewRecipeModalCtrl = function ($scope, $modalInstance, $http) {

    $scope.recipe = {
      name: "",
      style: "",
      link: ""
    };

    $scope.ok = function () {
      // send POST request to save recipe
      $http.post('/recipe/new', $scope.recipe)
      .success(function (data) {
        $modalInstance.close(data);
      })
      .error(function () {
        // do nothing
      });
    };

    $scope.cancel = function () {
      $modalInstance.dismiss('cancel');
    };
  };
