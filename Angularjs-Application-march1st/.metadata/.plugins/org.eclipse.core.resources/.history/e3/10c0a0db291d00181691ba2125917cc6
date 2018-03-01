package com.project2.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.DAO.BlogDAO;
import com.project2.model.Blog;
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

	public List<Blog> getallblog() {
		Session session=sessionFactory.getCurrentSession();
		List<Blog> bloglist=session.createQuery("from Blog").list();
		return bloglist;
	}

}
