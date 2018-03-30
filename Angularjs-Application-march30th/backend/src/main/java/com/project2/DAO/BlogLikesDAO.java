package com.project2.DAO;

import java.util.List;

import com.project2.model.BlogComment;
import com.project2.model.BlogLikes;
import com.project2.model.BlogLikesNumber;

public interface BlogLikesDAO 
{
	public void addBlogLikes(BlogLikes bloglikes);
	public List<BlogLikes> getallbloglikes(int blogid);
	public void updatebloglikesnumber(BlogLikesNumber number);
	public BlogLikesNumber getBlogLikesNumber(int blogid);
	public void deleteBlogLikes(BlogLikes bloglikes);

}
