package com.project2.DAO;

import com.project2.model.NotificationNumber;

public interface NotificatioNumberDAO {
public void updatenotificationnumber(NotificationNumber notificationnumber);
public NotificationNumber getnotificationnumber(String Username);
public void setnotificationnumber(String username);
}