package com.project2.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.DAO.FriendRequestNumberDAO;
import com.project2.model.FriendRequestsNumber;
import com.project2.model.Friends;
import com.project2.model.Notification;
import com.project2.model.NotificationNumber;
@Repository
@Transactional
public class Frnumberdaoimpl implements FriendRequestNumberDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void updatefrdrequestnumber(FriendRequestsNumber frdnumber) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(frdnumber);
		
	}

	public FriendRequestsNumber getnfrdnumber(String Username) {
		Session session=sessionFactory.getCurrentSession();
		FriendRequestsNumber frdnumber =(FriendRequestsNumber)session.get(FriendRequestsNumber.class, Username);
		return frdnumber;
	}

	

}
