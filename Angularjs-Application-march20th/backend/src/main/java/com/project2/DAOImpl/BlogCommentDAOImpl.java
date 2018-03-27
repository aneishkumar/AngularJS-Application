package com.project2.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.DAO.BlogCommentDao;

import com.project2.model.BlogComment;

@Repository
@Transactional
public class BlogCommentDAOImpl implements BlogCommentDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void addBlogComment(BlogComment blog) 
	{
		Session session=sessionFactory.getCurrentSession();
		session.save(blog);
		
	}
	
	
	
	public List<BlogComment> getallblogcoment(int blogid) {
		Session session=sessionFactory.getCurrentSession();
		
		Query query=session.createQuery("from BlogComment where blogid=:blogid");
		query.setParameter("blogid",blogid);
		List<BlogComment> bloglist=query.list();
		return bloglist;
	}
	public BlogComment getblog(int blogid) {
		
		Session session=sessionFactory.getCurrentSession();
		BlogComment blog=(BlogComment)session.get(BlogComment.class, blogid);
		return blog;
	}
	
}