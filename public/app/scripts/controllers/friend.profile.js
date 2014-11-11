'use strict';

angular.module('frontendApp')
  .controller('UserProfileCtrl', function ($scope, User, UserData, $location, $routeParams) {

    $scope.user = User.get({publicId: $routeParams.publicId});

    $scope.me = UserData.publicId;
  });
