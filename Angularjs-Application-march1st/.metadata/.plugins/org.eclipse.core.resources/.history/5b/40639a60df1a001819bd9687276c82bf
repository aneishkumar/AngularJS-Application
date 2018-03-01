/**
 * 
 */
app.controller('UserController',function($scope,$location,$rootScope,$cookieStore,UserService){
	UserService.gettallusers().then(function(response){
		alert("success")
		$scope.users=response.data;
	
	},
	function(response){
		alert("unsuccessfull")
		
	})
	UserService.getcurrentuserdata().then(function(response){
		alert("success")
		$scope.user=response.data;
	
	},
	function(response){
		alert("unsuccessfull")
		
	})
	
	$scope.logout=function()
	{
		
		
		UserService.logout().then(function(){
			alert("success")
		$rootScope.userlogged=undefined;
			
			
		},function(response){
			alert("unsuccessfull")
			
		})	
	
	}
	
	$scope.adduser=function(user)
	{
		
		UserService.adduser(user).then(function(response){
			alert("success")
		$scope.user={}
			
		},function(response){
			alert("unsuccessfull")
			
		})	
	
	}
	$scope.edituser=function(user)
	{
		
		UserService.edituser(user).then(function(response){
			alert("success")
		
			$location.path('/home')
			
		},function(response){
			alert("unsuccessfull")
			$location.path=('/login')
			
		})	
	
	}
	$scope.loginuser=function(user)
	{
		
		UserService.loginuser(user).then(function(response){
			alert("1st")
			$scope.user={}
			$rootScope.userlogged=response.data;
			$cookieStore.put('currentuser',response.data);
			$location.path('/home')
		
			
		},function(response){
			alert("unsuccessfull")
			$location.path=('/login')
			$scope.error=response.data;
			
			
		})	
	
	}
})