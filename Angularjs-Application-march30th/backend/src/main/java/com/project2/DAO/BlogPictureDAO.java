package com.project2.DAO;

import com.project2.model.BlogPicture;


public interface BlogPictureDAO {
	void addblogpicture(BlogPicture picture);
	public BlogPicture getBlogPicture(int blogid);
}
