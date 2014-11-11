'use strict';

angular.module('frontendApp')
  .controller('ForumsCtrl', function ($scope, $location) {
    $scope.forums = function () {
    	$location.path("forums/12");
    };
  });
