package com.project2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project2.DAO.BlogDAO;
import com.project2.model.Blog;

@RestController
public class BlogController 
{
@Autowired
private BlogDAO blogdao;
@RequestMapping(value="/addblog",method=RequestMethod.POST)
public void addUser(@RequestBody Blog blog)
{
	blogdao.addBlog(blog);
	
	
}

	

}
