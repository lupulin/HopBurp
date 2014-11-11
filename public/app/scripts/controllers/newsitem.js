'use strict';

angular.module('frontendApp')
  .controller('NewsitemCtrl', function ($scope, $routeParams) {
    $scope.params = $routeParams;
  });
