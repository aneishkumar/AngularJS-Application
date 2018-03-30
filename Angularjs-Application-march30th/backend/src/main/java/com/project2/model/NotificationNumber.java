package com.project2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="notificationnumber")
public class NotificationNumber {
	@Id
 private String username;
	private int num;
public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	

}
