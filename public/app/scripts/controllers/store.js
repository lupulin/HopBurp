'use strict';

angular.module('frontendApp')
  .controller('StoreCtrl', function ($scope, StoreData) {
    $scope.store = StoreData;

    $scope.BookStore = function(item) {
        return item.storeType === "Book";
    };

    $scope.EquipmentStore = function(item) {
        return item.storeType === "Equipment";
    };

  });
