'use strict';

describe('Controller: ClubCtrl', function () {

  // load the controller's module
  beforeEach(module('frontendApp'));

  var ClubCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    ClubCtrl = $controller('ClubCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
