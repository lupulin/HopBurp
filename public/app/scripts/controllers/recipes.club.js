'use strict';

angular.module('frontendApp')
  .controller('RecipesClubCtrl', function ($scope, $location) {
    
  	$scope.recipe = function () {
  		$location.path("/recipe/23");
  	}

  });