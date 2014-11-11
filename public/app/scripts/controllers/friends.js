'use strict';

angular.module('frontendApp')
  .controller('FriendsCtrl', function ($scope, User) {

    $scope.user = User.query();
    
  });
