/**
 * 
 */
app.factory('BlogService',function($http){
	var blogservice={}
	blogservice.addblog=function(blog){
		return $http.post("http://localhost:8085/bridgeware/addblog",blog)
		
	}
	blogservice.addjob=function(job){
		return $http.post("http://localhost:8085/bridgeware/addjob",job)
		
	}
	blogservice.addblogmessage=function(blogid,blogmessage){
		return $http.post("http://localhost:8085/bridgeware/addcomment/"+blogid+"/"+blogmessage)
		
	}
	
	blogservice.getallblog=function(){
		return $http.get("http://localhost:8085/bridgeware/seeallblog")
		
	}
	blogservice.getalljob=function(){
		return $http.get("http://localhost:8085/bridgeware/seealljob")
		
	}
	
	blogservice.getallblogadmin=function(){
		return $http.get("http://localhost:8085/bridgeware/seeallblogadmin")
		
	}
	blogservice.getallbloglikes=function(id){
		return $http.get("http://localhost:8085/bridgeware/getallbloglikes/"+id)
		
	}
	blogservice.displayblog=function(id){
		return $http.get("http://localhost:8085/bridgeware/display/"+id)
		
	}
	blogservice.displayjob=function(jobid){
		return $http.get("http://localhost:8085/bridgeware/displayjob/"+jobid)
		
	}
	blogservice.getuserjobstatus=function(jobid){
		return $http.get("http://localhost:8085/bridgeware/getjobappliedstatus/"+jobid)
		
	}
	blogservice.displayblogmessage=function(id){
		return $http.get("http://localhost:8085/bridgeware/displaymessage/"+id)
		
	}
	blogservice.updatebloglikes=function(blogid){
		return $http.get("http://localhost:8085/bridgeware/updatebloglikes/"+blogid)
	}
	
	blogservice.displayblogmessage=function(blogid){
		return $http.get("http://localhost:8085/bridgeware/displaymessage/"+blogid)
	}
	blogservice.approve=function(blogid){
		return $http.get("http://localhost:8085/bridgeware/adminapprove/"+blogid)
		
	}
	blogservice.reject=function(blogid){
		return $http.get("http://localhost:8085/bridgeware/adminreject/"+blogid)
		
	}
	blogservice.apply=function(jobid){
		return $http.get("http://localhost:8085/bridgeware/userjobapply/"+jobid)
		
	}
	return blogservice
})