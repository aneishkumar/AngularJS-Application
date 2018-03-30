package com.project2.DAO;


import java.util.List;

import com.project2.model.Friends;

public interface FriendDAO {
	public Friends getFriendId(long id);
	public void addFriend(Friends friends);
	public List<Friends> getallfriendrequest(String username);
	public void deleteFriendId(long friendid);
	public List<Friends> helpForSuggestedUser(String username);
	

}
