/**
 * 
 */
app.controller('BlogController',function($scope,BlogService)
	{	
	BlogService.getallblog().then(function(response){
		$scope.blogdata=response.data;
	},function(response)
	{
		alert("Unsucessfull")
	})
	$scope.addblog=function(blog)
	
	{
		alert("inside add blog")
	BlogService.addblog(blog).then(function(response){
		alert("Sucess")
		
	},function(response)
	{
	
		alert("failure")
		
	})
		}
	
	
})