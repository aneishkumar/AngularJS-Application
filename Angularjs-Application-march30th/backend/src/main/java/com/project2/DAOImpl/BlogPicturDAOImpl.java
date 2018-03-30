package com.project2.DAOImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.DAO.BlogPictureDAO;
import com.project2.model.BlogPicture;
import com.project2.model.ProfilePicture;

@Repository
@Transactional
public class BlogPicturDAOImpl implements BlogPictureDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public void addblogpicture(BlogPicture picture) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(picture);
		
	}

	public BlogPicture getBlogPicture(int blogid) {
		Session session=sessionFactory.getCurrentSession();
		BlogPicture picture=(BlogPicture)session.get(BlogPicture.class, blogid);
		return picture;
	}

}
