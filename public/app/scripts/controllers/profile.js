'use strict';

angular.module('frontendApp')
  .controller('ProfileCtrl', function ($scope, UserData) {

    $scope.user = UserData;

  });
