/**
 * 
 */
app.factory('BlogService',function($http){
	var blogservice={}
	blogservice.addblog=function(blog){
		return $http.post("http://localhost:8085/bridgeware/addblog",blog)
		
	}
	blogservice.addblog=function(blogid,bogmessage){
		return $http.post("http://localhost:8085/bridgeware/addcomment/"+blogid+"/+blogmessage")
		
	}
	blogservice.getallblog=function(){
		return $http.get("http://localhost:8085/bridgeware/seeallblog")
		
	}
	blogservice.displayblog=function(id){
		return $http.get("http://localhost:8085/bridgeware/display/"+id)
		
	}
	return blogservice
})