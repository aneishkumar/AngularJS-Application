/**
 * 
 */
app.controller('BlogController',function($scope,BlogService)
		{
	$scope.addblog=function(blog)
	{
	BlogService.addblog(blog).then(function(response){
		alert("Su")
		
	},function(response)
	{
	
		alert("failre")
		
	})
		}
	
	
})