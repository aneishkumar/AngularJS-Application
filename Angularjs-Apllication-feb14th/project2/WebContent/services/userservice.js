/**
 * 
 */
app.factory('UserService',function($http)
		{
	var userservice={}
	userservice.adduser=function(user){
		return $http.post("http://localhost:8085/bridgeware/adduser",user)
		
	}
	userservice.gettallusers=function()
	{
		return	$http.get("http://localhost:8085/bridgeware/seeusers")
	}
	return userservice
		})