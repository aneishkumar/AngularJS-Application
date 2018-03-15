package com.project2.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BlogLikes {
    @Id
private	int blogid;
private	int likes;
private String likedby;
private Date likedon;
	
}
