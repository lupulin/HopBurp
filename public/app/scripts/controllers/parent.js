'use strict';

angular.module('frontendApp')
  .controller('ParentCtrl', function ($scope, UserData, $location, $http, $modal) {

    $scope.user = UserData;

    $scope.profile = function($item, $model, $label) {
      $scope.selected = "";
      if ($item.publicId == UserData.publicId) {
        $location.path("/profile");
      } else {
        $location.path("/users/"+$item.publicId);
      }
    }

    $scope.selected = "";

    $scope.getUsers = function(val) {
      return $http.get('/user/search/'+val, {
        }).then(function(response){
          return response.data;
        });
    };

  });
