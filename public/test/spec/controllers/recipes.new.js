'use strict';

describe('Controller: RecipesNewCtrl', function () {

  // load the controller's module
  beforeEach(module('frontendApp'));

  var RecipesNewCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    RecipesNewCtrl = $controller('RecipesNewCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
