'use strict';

angular.module('frontendApp')
  .controller('AwardsCtrl', function ($scope, Club) {
    $scope.club = Club.query();
  });
