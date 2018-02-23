/**
 * 
 */
app.factory('UserService',function($http)
		{
	var userservice={}
	
	userservice.getcurrentuserdata=function()
	{
		return	$http.get("http://localhost:8085/bridgeware/currentuser")
	}
	userservice.adduser=function(user){
		return $http.post("http://localhost:8085/bridgeware/adduser",user)
		
	}
	userservice.edituser=function(user){
		return $http.post("http://localhost:8085/bridgeware/update",user)
		
	}
	userservice.gettallusers=function()
	{
		return	$http.get("http://localhost:8085/bridgeware/seeusers")
	}
	
	
	userservice.logout=function()
	{
		return	$http.get("http://localhost:8085/bridgeware/logout")
	}
	userservice.loginuser=function(user){
		return $http.post("http://localhost:8085/bridgeware/loginuser",user)
		
	}
	return userservice
	
		})