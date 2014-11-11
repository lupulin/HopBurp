'use strict';

angular.module('frontendApp')
  .controller('NewsCtrl', function ($scope, $location) {
    $scope.news = function () {
    	$location.path("news/12");
    }
  });
