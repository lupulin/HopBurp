'use strict';

var FeedbackModalCtrl = function ($scope, $modalInstance, $location, $http) {
	$scope.feedbackData = {
		name: "",
		email: "",
		message: "",
		url: $location.url()
	};

	$scope.ok = function () {
		// send POST request to save recipe
		$http.post('/feedback', $scope.feedbackData)
			.success(function (data) {
				$modalInstance.close(data);
			})
			.error(function () {
				// do nothing
			});
	};

	$scope.cancel = function () {
	  $modalInstance.dismiss('cancel');
	};
};

angular.module('frontendApp')
  .controller('FeedbackCtrl', function ($scope, $modal) {

  	$scope.feedbackData = {};

  	$scope.open = function () {
	 		$modal.open({
	 			templateUrl: "../assets/app/views/modals/feedbackmodal.html",
	 			controller: FeedbackModalCtrl
	 		});
		};
  });
