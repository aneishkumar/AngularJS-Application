package com.project2.DAOImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project2.DAO.FriendDAO;
import com.project2.model.Friends;
@Repository
@Transactional
public class FriendsDAOImpl implements FriendDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public void addFriend(Friends friend) {
		Session session=sessionFactory.getCurrentSession();
		session.save(friend);	
	}

}
