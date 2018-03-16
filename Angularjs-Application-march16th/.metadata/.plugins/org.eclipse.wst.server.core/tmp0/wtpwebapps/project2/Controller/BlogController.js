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
		
	})
	BlogService.getallblogadmin().then(function(response){
		
		$scope.adminblogdata = response.data;
	},function(response)
	{
		
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

	$scope.approve=function(blogq)
	
	{
		var blogid=$scope.blogq.blogid;
	BlogService.approve(blogid).then(function(response){
		$location.path('/blogapproval')
	},function(response)
	{
	
		alert("failure")
		
	})
		}
$scope.reject=function(blogq)
	
	{
	$location.path('/blogapproval')
		var blogid=$scope.blogq.blogid;
	BlogService.reject(blogid).then(function(response){
		
	},function(response)
	{
	
		alert("failure")
		
	})
		}
$scope.addcomment=function(blogq,blogmessage)
	
	{
	
	var blogid=$scope.blogq.blogid;
		
	BlogService.addblogmessage(blogid,blogmessage).then(function(response){
		$scope.blogmessage="";
		BlogService.displayblogmessage(blogid).then(function(response)
				{
					$scope.blogmessages = response.data;
					
				},function(response)
				{
					
					
				})
		
		
	},function(response)
	{
	
		alert("Failed to post message")
		
	})
		}
	if(id!=undefined)
			{
		
			
	
	BlogService.displayblog(id).then(function(response)
	{
		$scope.blogq = response.data;
		
	},function(response)
	{
		
		
	})
	BlogService.displayblogadmin(id).then(function(response)
	{
		$scope.bloga = response.data;
		
	},function(response)
	{
		
		
	})
	BlogService.displayblogmessage(id).then(function(response)
	{
		$scope.blogmessages = response.data;
		
	},function(response)
	{
	
		
	})
	
	
		
			}
	
	
})