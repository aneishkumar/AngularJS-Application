package com.project2.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.DAO.NotificationDAO;
import com.project2.model.Notification;
import com.project2.model.NotificationNumber;
@Repository
@Transactional
public class NotificationDAOImpl implements NotificationDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addnotification(Notification notification) {
		Session session=sessionFactory.getCurrentSession();
		session.save(notification);	
		
	}
	public List<Notification> getallnotifications(String username)
	{
		
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Notification where username=:username ");
		query.setParameter("username",username);
		List<Notification> list=query.list();
		return list;
		
	}
	public void deletenotification(int id)
	{
		Session session=sessionFactory.getCurrentSession();
		Notification notification=(Notification)session.get(Notification.class, id);
		session.delete(notification);
	}

}
