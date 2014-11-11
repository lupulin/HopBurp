'use strict';

angular.module('frontendApp')
  .controller('RecipedetailsCtrl', function ($scope, $routeParams) {
    $scope.params = $routeParams;
  });
