'use strict';

describe('Controller: UsercalendarCtrl', function () {

  // load the controller's module
  beforeEach(module('frontendApp'));

  var UsercalendarCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    UsercalendarCtrl = $controller('UsercalendarCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
