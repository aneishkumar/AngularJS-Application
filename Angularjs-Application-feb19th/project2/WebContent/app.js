/**
 * 
 */

var app=angular.module("myapp",['ngRoute','ngCookies'])
app.config(function($routeProvider){
	$routeProvider
	.when('/register',{
		templateUrl:'registrationcheck.html',
		controller:'UserController'
	})
	.when('/seealluser',{
		templateUrl:'seeusers.html',
		controller:'UserController'
	})
	.when('/login',{
		templateUrl:'login.html',
		controller:'UserController'
	})
	.when('/home',{
		templateUrl:'home.html'
		
	})
	
	
	
	.otherwise({redirectTo: '/'});
})
app.run(function($rootScope,UserService){
	
	$rootScope.logout=function()
	{
		UserService.logout().then(function(){
			alert("success")
		delete $rootScope.userlogged;
		$cookieStore.remove('currentuser')	
			
			
		},function(response){
			alert("unsuccessfull")
			
		})	
	
	
	}
})