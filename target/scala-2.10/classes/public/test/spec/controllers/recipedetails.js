'use strict';

describe('Controller: RecipedetailsCtrl', function () {

  // load the controller's module
  beforeEach(module('frontendApp'));

  var RecipedetailsCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    RecipedetailsCtrl = $controller('RecipedetailsCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
