package com.project2.DAO;

import java.util.List;

import com.project2.model.Blog;
import com.project2.model.Notification;

public interface NotificationDAO {
	

	void addnotification(Notification notification);
	void updatenotification(Notification notification);
	
	public List<Notification> getallnotifications(String username);
	public void deletenotification(int id);
	public List<Notification> getallnotificationsnotviewed(String username);
	
	

}
