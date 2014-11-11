'use strict';

angular.module('frontendApp')
  .controller('SettingsCtrl', function ($scope, User) {

    $scope.user = User.query();

  });
