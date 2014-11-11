'use strict';

describe('Controller: ForumsCtrl', function () {

  // load the controller's module
  beforeEach(module('frontendApp'));

  var ForumsCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    ForumsCtrl = $controller('ForumsCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
