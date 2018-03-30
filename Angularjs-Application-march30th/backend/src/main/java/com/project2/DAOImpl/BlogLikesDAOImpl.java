package com.project2.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.DAO.BlogLikesDAO;
import com.project2.model.BlogComment;
import com.project2.model.BlogLikes;
import com.project2.model.BlogLikesNumber;

@Repository
@Transactional
public class BlogLikesDAOImpl implements BlogLikesDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public void addBlogLikes(BlogLikes bloglikes) {
		Session session=sessionFactory.getCurrentSession();
		session.save(bloglikes);
		
	}

	public List<BlogLikes> getallbloglikes(int blogid) 
	{

		Session session=sessionFactory.getCurrentSession();		
		Query query=session.createQuery("from BlogLikes where blogid=:blogid");
		query.setParameter("blogid",blogid);
		List<BlogLikes> bloglist=query.list();
		return bloglist;
	}
	public void updatebloglikesnumber(BlogLikesNumber number) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(number);
		
	}

	public BlogLikesNumber getBlogLikesNumber(int blogid) {
		Session session=sessionFactory.getCurrentSession();
		BlogLikesNumber notificationnumber =(BlogLikesNumber)session.get(BlogLikesNumber.class, blogid);
		return notificationnumber;
	}
	public void deleteBlogLikes(BlogLikes bloglikes) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(bloglikes);
	
}
}
