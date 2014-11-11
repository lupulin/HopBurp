'use strict';

angular.module('frontendApp')
  .controller('ClubCtrl', function ($scope, Club) {
    $scope.club = Club.query();
  });
