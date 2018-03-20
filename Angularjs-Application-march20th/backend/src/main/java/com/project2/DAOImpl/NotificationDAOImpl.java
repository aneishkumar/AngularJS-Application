package com.project2.DAOImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.DAO.NotificationDAO;
import com.project2.model.Notification;
@Repository
@Transactional
public class NotificationDAOImpl implements NotificationDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addnotification(Notification notification) {
		Session session=sessionFactory.getCurrentSession();
		session.save(notification);	
		
	}

}
