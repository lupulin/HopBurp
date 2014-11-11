'use strict';

describe('Controller: RecipesClubCtrl', function () {

  // load the controller's module
  beforeEach(module('frontendApp'));

  var RecipesClubCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    RecipesClubCtrl = $controller('RecipesClubCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
