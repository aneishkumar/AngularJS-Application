package com.project2.DAO;

import java.util.List;

import com.project2.model.Blog;
import com.project2.model.BlogComment;

public interface BlogCommentDao {
	public void addBlogComment(BlogComment blogcomment);
	public List<BlogComment> getallblogcoment(int blogid);
	
}
