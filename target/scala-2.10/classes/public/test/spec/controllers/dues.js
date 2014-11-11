'use strict';

describe('Controller: DuesCtrl', function () {

  // load the controller's module
  beforeEach(module('frontendApp'));

  var DuesCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    DuesCtrl = $controller('DuesCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
