package com.project2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="blogcomment")
public class BlogComment
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int commentid;
    private String message;
    
	
	







	private String username;
	private Date postedon;
	
	public Date getPostedon() {
		return postedon;
	}



	public void setPostedon(Date postedon) {
		this.postedon = postedon;
	}







	private int blogid;
	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}
    public int getCommentid() {
		return commentid;
	}



	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}



	



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public int getBlogid() {
		return blogid;
	}



	public void setBlogid(int blogid) {
		this.blogid = blogid;
	}



	
	
	
	
	public BlogComment() {
		System.out.println("===========================This is blogcomment class=============================");
	}
	
	
	
	
}
