package com.project2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="friendrequestnumber")
public class FriendRequestsNumber {
	@Id
 private String username;
	private int num1;
public int getNum1() {
		return num1;
	}
	public void setNum(int num1) {
		this.num1 = num1;
	}
public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	

}
