'use strict';

angular.module('frontendApp')
  .controller('FriendRecipesCtrl', function ($scope, User, UserData, UserRecipes, $location, $routeParams) {

    $scope.recipes = UserRecipes.query({publicId: $routeParams.publicId});

    $scope.user = User.get({publicId: $routeParams.publicId});

    $scope.recipe = function (publicId) {
      $location.path("/recipe/"+publicId);
    }

  });
