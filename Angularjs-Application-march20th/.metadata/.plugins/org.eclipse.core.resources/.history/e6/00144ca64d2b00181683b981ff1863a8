package com.project2.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project2.DAO.BlogCommentDao;
import com.project2.DAO.BlogDAO;
import com.project2.model.Blog;
import com.project2.model.BlogComment;
import com.project2.model.User;

@RestController
public class BlogController 
{
@Autowired
private BlogDAO blogdao;
@Autowired
private BlogCommentDao commentdao;
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
@RequestMapping(value="/seeallblogadmin",method=RequestMethod.GET)
public List<Blog> seeAllBlogadmin()
{
	List<Blog> allblog=(List<Blog>)this.blogdao.getallblogadmin();
	return allblog;
	
	
}
@RequestMapping(value="/display/{id}")
public Blog displayblog(@PathVariable("id")int id)
{
	Blog blog=blogdao.getblog(id);
	return blog;
	
}
@RequestMapping(value="/adminapprove/{id}")
public void approveblog(@PathVariable("id")int id)
{
	Blog blog=blogdao.getblog(id);
	blog.setApproved(true);
	blogdao.updateBlog(blog);
	
	
}
@RequestMapping(value="/adminreject/{id}")
public void rejectblog(@PathVariable("id")int id)
{
	Blog blog=blogdao.getblog(id);
	blog.setRejected(true);
	blogdao.updateBlog(blog);
	
	
}
@RequestMapping(value="/addcomment/{blogid}/{blogmessage}")
public boolean displayblogf(@PathVariable("blogid")int id,@PathVariable("blogmessage")String comment,BlogComment blogcomment,HttpSession session)
{
	String username=(String)session.getAttribute("userlogged");
	blogcomment.setBlogid(id);
	blogcomment.setMessage(comment);
	blogcomment.setUsername(username);
	
	commentdao.addBlogComment(blogcomment);
	return true;
}
@RequestMapping(value="/displaymessage/{id}")
public List<BlogComment> seeAllBlogc(@PathVariable("id")int blogid)
{
	List<BlogComment> allblog=(List<BlogComment>)this.commentdao.getallblogcoment(blogid);
	return allblog;
	
	
}


	

}
