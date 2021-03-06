package com.project2.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.DAO.BlogDAO;
import com.project2.model.Blog;
import com.project2.model.User;
@Repository
@Transactional
public class BlogDAOImpl implements BlogDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	public void addBlog(Blog blog) 
	{
		Session session=sessionFactory.getCurrentSession();
		session.save(blog);
		
	}
	public void updateBlog(Blog blog) 
	{
		Session session=sessionFactory.getCurrentSession();
		session.update(blog);
		
	}
	public void deleteblog(int blogid) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Blog blog=(Blog)session.get(Blog.class, blogid);
		session.delete(blog);
		
	}
	public void approve(int blogid) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Blog blog=(Blog)session.get(User.class, blogid);
		blog.setApproved(true);
		
	}
	
	public List<Blog> getallblog() {
		Session session=sessionFactory.getCurrentSession();
		List<Blog> bloglist=session.createQuery("from Blog where approved='1'").list();
		return bloglist;
	}
	public List<Blog> getallblogadmin()
	{
		Session session=sessionFactory.getCurrentSession();
		List<Blog> bloglist=session.createQuery("from Blog where approved='0'and rejected='0'").list();
		return bloglist;
	}
	
	public Blog getblog(int blogid) {
		
		Session session=sessionFactory.getCurrentSession();
		Blog blog=(Blog)session.get(Blog.class, blogid);
		return blog;
	}

}
