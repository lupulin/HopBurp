'use strict';

var RSVPModalCtrl = function ($scope, $modalInstance) {
	$scope.rsvpData = {};

	$scope.ok = function () {
	  $modalInstance.close($scope.rsvpData);
	};

	$scope.cancel = function () {
	  $modalInstance.dismiss('cancel');
	};
};


angular.module('frontendApp')
  .controller('CalendarCtrl', function ($scope, $modal) {

		$scope.alertOnEventClick = function (event) {
				$modal.open({
	 			templateUrl: "views/modals/rsvpmodal.html",
	 			controller: RSVPModalCtrl
	 		});
	 	}   

    /* config object */
		$scope.uiConfig = {
			calendar:{
				height: 450,
				editable: true,
				header:{
					left: 'month basicWeek basicDay agendaWeek agendaDay',
					center: 'title',
					right: 'today prev,next'
				},
				eventClick: $scope.alertOnEventClick,
				eventDrop: $scope.alertOnDrop,
				eventResize: $scope.alertOnResize,
			}
		};

		$scope.events = [
			{
				title  : 'event1',
				start  : '2014-04-01'
			},
			{
				title  : 'event2',
				start  : '2014-04-05',
				end    : '2014-04-07'
			},
			{
				title  : 'event3',
				start  : '2014-04-09 12:30:00',
				allDay : false // will make the time show
			}
		];

		$scope.eventSources = [$scope.events];
	});
