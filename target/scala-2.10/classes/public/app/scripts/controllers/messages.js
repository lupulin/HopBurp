'use strict';

angular.module('frontendApp')
  .controller('MessagesCtrl', function ($scope, UserData) {
    $scope.user = UserData;

    $scope.messageStreams = UserData.messageStreams;
  });
