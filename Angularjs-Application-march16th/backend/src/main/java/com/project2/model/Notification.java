package com.project2.model;

public class Notification {
	private int id;
	private String blogtitle;
	private String username;
	private String approvedstatus;
	private String rejectionreason;
	private boolean viewed;
	public boolean isViewed() {
		return viewed;
	}
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBlogtitle() {
		return blogtitle;
	}
	public void setBlogtitle(String blogtitle) {
		this.blogtitle = blogtitle;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getApprovedstatus() {
		return approvedstatus;
	}
	public void setApprovedstatus(String approvedstatus) {
		this.approvedstatus = approvedstatus;
	}
	public String getRejectionreason() {
		return rejectionreason;
	}
	public void setRejectionreason(String rejectionreason) {
		this.rejectionreason = rejectionreason;
	}
	

}
