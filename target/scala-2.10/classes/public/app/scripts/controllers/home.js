'use strict';

angular.module('frontendApp')
  .controller('HomeCtrl', function ($scope, UserData) {
    $scope.user = UserData;
  });
