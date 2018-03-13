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
	.when('/updateprofile',{
		templateUrl:'updateuser.html',
		controller:'UserController'
	})
	.when('/addblog',{
		templateUrl:'addblog.html',
		controller:'BlogController'
		
		
	})
	.when('/profilepic',{
		templateUrl:'views/uploadprofilepic.html'
	})
	.when('/display/:id',{
		templateUrl:'displayblog.html',
		controller:'BlogController'
		
		
	})
	.when('/allblog',{
		templateUrl:'seeallblogs.html',
		controller:'BlogController'
		
		
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
app.run(function($rootScope,$location,UserService,$cookieStore){
	
	$rootScope.logout=function()
	{
		UserService.logout().then(function(){
			alert("success")
		delete $rootScope.userlogged;
		$cookieStore.remove('currentuser')	
		$location.path('/home')
			
			
		},function(response){
			alert("unsuccessfull")
			
		})	
	
	
	}
})