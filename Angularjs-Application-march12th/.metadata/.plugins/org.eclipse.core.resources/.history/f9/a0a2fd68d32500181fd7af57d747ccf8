/**
 * 
 */
app.controller('BlogController',function($scope,$sce,$location,$routeParams,BlogService)
	{	
	var id=$routeParams.id
	BlogService.getallblog().then(function(response){
		
		$scope.blogdata = response.data;
		$scope.blogdata1=$sce.trustAsHtml(response.data);
	},function(response)
	{
		alert("Unsucessfull")
	})
	$scope.addblog=function(blog)
	
	{
		
	BlogService.addblog(blog).then(function(response){
		$location.path('/home')
	},function(response)
	{
	
		alert("failure")
		
	})
		}
	if(id!=undefined)
			{
		
			
	
	BlogService.displayblog(id).then(function(response)
	{
		$scope.blogq = response.data;
		
	},function(response)
	{
		alert("Unsucessfull")
		
	})
	
		
			}
	
	
})