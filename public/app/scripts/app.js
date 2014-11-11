'use strict';

angular
  .module('frontendApp', [
    'ui.calendar',
    'ngCookies',
    'frontendServices',
    'ngSanitize',
    'ngRoute',
    'ui.bootstrap',
    'ngAnimate',
    'ngDragDrop',
    'relativeDate',
    'googlechart',
    'ui.gravatar'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/recipe/:publicId', {
        templateUrl: '../assets/app/views/recipe.html',
        controller: 'RecipeCtrl'
      })
      .when('/profile/', {
        templateUrl: '../assets/app/views/profile.html',
        controller: 'ProfileCtrl'
      })
      .when('/settings/', {
        templateUrl: '../assets/app/views/settings.html',
        controller: 'SettingsCtrl'
      })
      .when('/awards', {
        templateUrl: '../assets/app/views/awards.html',
        controller: 'AwardsCtrl'
      })
      .when('/forums', {
        templateUrl: '../assets/app/views/forums.html',
        controller: 'ForumsCtrl'
      })
      .when('/news', {
        templateUrl: '../assets/app/views/news.html',
        controller: 'NewsCtrl'
      })
      .when('/members', {
        templateUrl: '../assets/app/views/members.html',
        controller: 'MembersCtrl'
      })
      .when('/dues', {
        templateUrl: '../assets/app/views/dues.html',
        controller: 'DuesCtrl'
      })
      .when('/calendar', {
        templateUrl: '../assets/app/views/calendar.html',
        controller: 'CalendarCtrl'
      })
      .when('/docs', {
        templateUrl: '../assets/app/views/docs.html',
        controller: 'DocsCtrl'
      })
      .when('/photos', {
        templateUrl: '../assets/app/views/photos.html',
        controller: 'PhotosCtrl'
      })
      .when('/recipes', {
        templateUrl: '../assets/app/views/recipes.html',
        controller: 'RecipesCtrl'
      })
      .when('/recipes/new', {
        templateUrl: '../assets/app/views/recipes.new.html',
        controller: 'RecipesNewCtrl'
      })
      .when('/club/recipes', {
        templateUrl: '../assets/app/views/recipes.club.html',
        controller: 'RecipesClubCtrl'
      })
      .when('/club', {
        templateUrl: '../assets/app/views/club.html',
        controller: 'ClubCtrl'
      })
      .when('/friends', {
        templateUrl: '../assets/app/views/friends.html',
        controller: 'FriendsCtrl'
      })
      .when('/users/:publicId', {
        templateUrl: '../assets/app/views/friend.profile.html',
        controller: 'UserProfileCtrl'
      })
      .when('/messages', {
        templateUrl: '../assets/app/views/messages.html',
        controller: 'MessagesCtrl'
      })
      .when('/news/:newsId', {
        templateUrl: '../assets/app/views/newsitem.html',
        controller: 'NewsitemCtrl'
      })
      .when('/forums/:forumsId', {
        templateUrl: '../assets/app/views/forummessage.html',
        controller: 'ForummessageCtrl'
      })
      .when('/store', {
        templateUrl: '../assets/app/views/store.html',
        controller: 'StoreCtrl'
      })
      .when('/support', {
        templateUrl: '../assets/app/views/support.html',
        controller: 'SupportCtrl'
      })
      .when('/message/:messageId', {
        templateUrl: '../assets/app/views/message.html',
        controller: 'MessageCtrl'
      })
      .when('/usercalendar', {
        templateUrl: '../assets/app/views/usercalendar.html',
        controller: 'UsercalendarCtrl'
      })
      .when('/recipe/:recipeId/details', {
        templateUrl: '../assets/app/views/recipedetails.html',
        controller: 'RecipedetailsCtrl'
      })
      .when('/user/:publicId/recipes', {
        templateUrl: '../assets/app/views/friend.recipes.html',
        controller: 'FriendRecipesCtrl'
      })
      // .when('/', {
      //   templateUrl: '../assets/app/views/home.html',
      //   controller: 'HomeCtrl'
      // })
      .otherwise({
        redirectTo: '/profile/'
      });
  });
