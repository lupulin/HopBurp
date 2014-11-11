'use strict';

angular.module('frontendApp')
  .controller('RecipeCtrl', function ($scope, $routeParams, UserData, $modal, Recipes, $filter, $http) {

    $scope.publicId = $routeParams.publicId;

    $scope.me = UserData;

    Recipes.get({publicId: $routeParams.publicId}, function (recipe) {

        $scope.recipe = recipe;

        $scope.comments = recipe.comments;

        $scope.awards = recipe.awards;

        var data = $filter('orderBy')(recipe.notes, "+created", true);
        data = $filter('limitTo')(data, 5);
        data = $filter('orderBy')(data, "-created", true);

        $scope.rows = [];
        for (var d in data) {
          $scope.rows.push({"c": [{ "v": $filter('relativeDate')(data[d].created)}, { "v": data[d].score}]});
        }

        $scope.chartObject = {
          "type": "AreaChart",
          "displayed": false,
          "data": {
            "cols": [
              {
                "id": "date",
                "label": "Date",
                "type": "string"
              },
              {
                "id": "score-id",
                "label": $scope.recipe.name,
                "type": "number"
              }
            ],
            "rows": $scope.rows
          },
          "options": {
            "title": "Most Recent Homebrew Scores by Date",
            "isStacked": "false",
            "fill": 20,
            "displayExactValues": true,
            "vAxis": {
              "title": "Score",
              "gridlines": {
                "count": 10
              }
            },
            "hAxis": {
              "title": "Date"
            }
          },
          "formatters": {}
        };
      });

    $scope.open = function () {

      var modalInstance = $modal.open({
        templateUrl: 'newNoteModal.html',
        controller: NewNoteModalCtrl,
        size: 'lg',
      });

      modalInstance.result.then(function (data) {
        if (data.award != null) {
          $scope.awards.push(data.award);
        }
        $scope.rows.push({"c": [{ "v": $filter('relativeDate')(data.note.created)}, { "v": data.note.score}]});
      });
    };

    $scope.commentData = {
      comment: ""
    };
    $scope.postComment = function() {
      if ($scope.commentData.comment.trim() != "") {
        return $http.post('/recipe/'+$routeParams.publicId+'/comment', $scope.commentData)
          .success(function(data) {
            $scope.commentData.comment = "";
            $scope.comments.push(data);
          });
      }
    };

  });

  var NewNoteModalCtrl = function ($scope, $modalInstance, $http, $routeParams) {

    $scope.note = {
      score: "",
      criticism: "",
      awarded: 0,
      eventname: ""
    };

    $scope.ok = function () {
      // send POST request to save recipe
      $http.post('/recipe/'+$routeParams.publicId+'/note', $scope.note)
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
