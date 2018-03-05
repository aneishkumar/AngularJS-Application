/**
 * 
 */
app.controller('BlogController',function($scope,$sce,$location,$routeParams,BlogService)
	{	
	var id=$routeParams.blogid;
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
	$scope.displayblog=function(id)
	{
	BlogService.displayblog(id).then(function(response)
	{
		$scope.blog = response.data;
		$location.path('/home')
	},function(response)
	{
		alert("Unsucessfull")
		
	})
		
			}
	
	
})