/**
 * 
 */
app.controller('UserController',function($scope,$location,$rootScope,$cookieStore,UserService){
	UserService.gettallusers().then(function(response){
		
		$scope.users=response.data;
	
	},
	function(response){
		
		
	})
	
	if($rootScope.userlogged!=undefined)
		{
	UserService.getcurrentuserdata().then(function(response){
		
		$scope.user=response.data;
	
	},
	function(response){
		
		
	})
		}
UserService.gettallsuggesteduser().then(function(response){
		
		$scope.userss=response.data;
	
	},
	function(response){
		
		
	})
	
	
	$scope.logout=function()
	{
		
		
		UserService.logout().then(function(){
			
		$rootScope.userlogged=undefined;
			
			
		},function(response){
			alert("unsuccessfull")
			
		})	
	
	}
	$scope.addfriend=function(u)
	{
		var username=$scope.u.username;
		
		UserService.addfriend(username).then(function(){
			
		
			
			
		},function(response){
			alert("Successfully posted friend request")
			
		})	
	
	}
	
	$scope.adduser=function(user)
	{
		
		UserService.adduser(user).then(function(response){
			
		
			$location.path('/login')
			
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
			alert("unsuccessfulledit")
			$location.path=('/login')
			
		})	
	
	}
	$scope.loginuser=function(user)
	{
		
		UserService.loginuser(user).then(function(response){
			$rootScope.userlogged=response.data;
			/*console.log("=====================role is ======================="+userlogged.role);*/
			$scope.user={}
			
						
			$cookieStore.put('currentuser',response.data);
			$location.path('/home')
		
			
		},function(response){
			
			$location.path=('/login')
			$scope.error=response.data;
			
			
		})	
	
	}
	
})