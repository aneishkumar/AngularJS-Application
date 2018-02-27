package com.project2.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project2.DAO.BlogDAO;
import com.project2.model.Blog;
import com.project2.model.User;

@RestController
public class BlogController 
{
@Autowired
private BlogDAO blogdao;
@RequestMapping(value="/addblog",method=RequestMethod.POST)
public void addUser(@RequestBody Blog blog,HttpSession session)
{
	String username=(String)session.getAttribute("userlogged");
	blog.setUsername(username);
	blogdao.addBlog(blog);
	
	
}
@RequestMapping(value="/seeallblog",method=RequestMethod.GET)
public List<Blog> seeAllBlog()
{
	List<Blog> allblog=(List<Blog>)this.blogdao.getallblog();
	return allblog;
	
	
}

	

}
