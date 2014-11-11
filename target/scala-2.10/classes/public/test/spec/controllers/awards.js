'use strict';

describe('Controller: AwardsCtrl', function () {

  // load the controller's module
  beforeEach(module('frontendApp'));

  var AwardsCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    AwardsCtrl = $controller('AwardsCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
