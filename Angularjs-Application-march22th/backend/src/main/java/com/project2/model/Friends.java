package com.project2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Component
@Table(name="friends")
public class Friends 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long friendid;
	private String fromid;
	private String toid;
	private boolean accepted;
	private boolean rejected;
	public long getFriendid() {
		return friendid;
	}
	public void setFriendid(long friendid) {
		this.friendid = friendid;
	}
	public String getFromid() {
		return fromid;
	}
	public void setFromid(String fromid) {
		this.fromid = fromid;
	}
	public String getToid() {
		return toid;
	}
	public void setToid(String toid) {
		this.toid = toid;
	}
	public boolean isAccepted() {
		return accepted;
	}
	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
	public boolean isRejected() {
		return rejected;
	}
	public void setRejected(boolean rejected) {
		this.rejected = rejected;
	}
	
	
	
	

}
