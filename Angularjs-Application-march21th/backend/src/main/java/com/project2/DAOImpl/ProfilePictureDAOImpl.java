package com.project2.DAOImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.DAO.ProfilePictureDAO;
import com.project2.model.ProfilePicture;

@Repository
@Transactional
public class ProfilePictureDAOImpl implements ProfilePictureDAO  {
	@Autowired
	private SessionFactory sessionFactory;

	public void addprofilepicture(ProfilePicture picture) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(picture);
		
	}
	public ProfilePicture getProfilePicture(String username)
	{
		Session session=sessionFactory.getCurrentSession();
		ProfilePicture picture=(ProfilePicture)session.get(ProfilePicture.class, username);
		return picture;
	}

}
