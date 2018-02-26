/**
 * 
 */
app.factory('BlogService',function($https){
	var blogservice={}
	userservice.addblog=function(blog){
		return $http.post("http://localhost:8085/bridgeware/addblog",blog)
		
	}
	
})