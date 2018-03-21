package com.project2.DAO;



import java.util.List;

import com.project2.model.User;

public interface UserDAO{

	void addUser(User user);
	public List<User> gettalluser();
	public List<User> gettallsuggesteduser(String username);
    public void deleteuser(String username);
    public void edituser(User user);
    public User getuser(String username);
}
