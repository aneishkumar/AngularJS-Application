package com.project2.DAO;

import java.util.List;

import com.project2.model.Blog;

public interface BlogDAO {
	public void addBlog(Blog blog);
	public void updateBlog(Blog blog);
	public List<Blog> getallblog();
	public List<Blog> getallblogadmin();
	public void deleteblog(int blogid);
	public Blog getblog(int blogid);
	

}
