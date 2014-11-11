'use strict';

angular.module('frontendApp')
  .controller('RecipesNewCtrl', function ($scope) {
    $scope.fermentables = [{'name': 'American 2-Row'}];
    $scope.hops = [{'name': 'Citra Hops'}];
    $scope.yeasts = [{'name': 'American Ale Yeast'}];

    $scope.recipe1 = [];
    $scope.recipe2 = [];
    $scope.recipe3 = [];
  });
