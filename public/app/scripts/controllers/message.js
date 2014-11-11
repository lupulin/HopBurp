'use strict';

angular.module('frontendApp')
  .controller('MessageCtrl', function ($scope, $routeParams) {
  	$scope.params = $routeParams;
  });
