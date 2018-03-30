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
		UserService.gettallsuggesteduser().then(function(response){
			
			$scope.userss=response.data;
		
		},
		function(response){
			
			
		})
		
		
	UserService.getcurrentuserdata().then(function(response){
		
		$scope.user=response.data;
	
	},
	function(response){
		
		
	})

	
		}

	
	
	
	$scope.addfriend=function(username)
	{
		
		
		
		
		UserService.addfriend(username).then(function(){
			
			alert("Successfully posted friend request")
			UserService.gettallsuggesteduser().then(function(response){
		
		$scope.userss=response.data;
	
	},
	function(response){
		
		
	})
			
			
		},function(response){
			
			
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
			
		
			$location.path('/home')
			
		},function(response){
			
			$location.path=('/login')
			
		})	
	
	}
	$scope.loginuser=function(userl)
	{
		
		UserService.loginuser(userl).then(function(response){
			$rootScope.userlogged=response.data;
			/*console.log("=====================role is ======================="+userlogged.role);*/
			$scope.user={}
			
						
			$cookieStore.put('currentuser',response.data);
			$location.path('/home')
			UserService.getallfriedrequests().then(function(response){
		
		$rootScope.friendrequests=response.data;
	
	},
	function(response){
		alert("unsucessing fetching friend request")
		
	})
	UserService.getfriendrequestnumber().then(function(response){
		
		
		$rootScope.frdnumber=response.data;
	
	},
	function(response){
		
		
		
	})
			
			UserService.getnotificationnumber().then(function(response){
		
		
		$rootScope.notinumber=response.data;
	
	},
	function(response){
		
		
		
	})
	UserService.getallnotifications().then(function(response){
		
		$rootScope.notification=response.data;
		
	
	},
	function(response){
		
		
	})
		
			
		},function(response){
			
			$location.path=('/login')
			$scope.error=response.data;
			$scope.userl={}
			
			
		})
		
		
		
		
		
	}
		
	
	
	
	

	
	
	

	
	
	
})