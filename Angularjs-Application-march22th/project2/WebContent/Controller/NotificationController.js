/**
 * 
 */

app.controller('NotificationController',function($scope,$location,$rootScope,$cookieStore,UserService){

if(userlogged!=undefined)
	{
	UserService.getnotificationnumber().then(function(response){
		
		$scope.notinumber=response.data;
	
	},
	function(response){
		
		
	})
	UserService.getallnotifications().then(function(response){
		
		$scope.notification=response.data;
	
	},
	function(response){
		
		
	})
	
	
	
	
	
	
	
	}
})