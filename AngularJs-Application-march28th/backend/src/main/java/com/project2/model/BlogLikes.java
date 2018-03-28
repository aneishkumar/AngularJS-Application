package com.project2.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="bloglikes")
public class BlogLikes {
    
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int likeid;
private	int blogid;
private String likedby;

public int getLikeid() {
	return likeid;
}
public void setLikeid(int likeid) {
	this.likeid = likeid;
}
public int getBlogid() {
	return blogid;
}
public void setBlogid(int blogid) {
	this.blogid = blogid;
}
public String getLikedby() {
	return likedby;
}
public void setLikedby(String likedby) {
	this.likedby = likedby;
}



	
}
