package com.project2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpSession;


import com.project2.DAO.UserDAO;
import com.project2.model.*;
import com.project2.model.Error;
@RestController
public class UserController {
	@Autowired
	private UserDAO userdao;
	@RequestMapping(value="/adduser",method=RequestMethod.POST)
	public void addUser(@RequestBody User user)
	{
		userdao.addUser(user);
		
		
	}
	@RequestMapping(value="/seeusers",method=RequestMethod.GET)
	public List<User> seealluser()
	{
		
		List<User> alluser=(List<User>)this.userdao.gettalluser();
		return alluser;
		
	}
	@RequestMapping(value="/deleteuser/{user}",method=RequestMethod.GET)
	public List<User> deleteuser(@PathVariable("user") String username)
	{
		
		userdao.deleteuser(username);
		List<User> alluser=(List<User>)this.userdao.gettalluser();
		return alluser;
	}
	@RequestMapping(value="/edituser/{user}",method=RequestMethod.GET)
	public User edituser(@PathVariable("user")String username)
	{
		User user=userdao.getuser(username);
		
		return user;
		
	}
	@RequestMapping(value="/currentuser",method=RequestMethod.GET)
	public User edituser(HttpSession session)
	
	{
		
		String username=(String)session.getAttribute("userlogged");

		User user=userdao.getuser(username);
		
		return user;
		
	}
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public void update(@RequestBody User user,HttpSession session)
	{
		userdao.edituser(user);
		

		
		
	}
	@RequestMapping(value="/loginuser",method=RequestMethod.POST)
	public ResponseEntity<?> checkusername(@RequestBody User user, HttpSession session)
	{
		 String username=user.getUsername();
		 String password=user.getPassword();
		 String role=user.getRole();
		 
		 
		int i=0;
		List<User> alluser=(List<User>)this.userdao.gettalluser();
		for(User user1:alluser)
		{
			
			if(username.equals(user1.getUsername()))
			{
				if(password.equals(user1.getPassword()))
				{
					
					i=1;
				}
			}
		}
		
		if(i==0)
		{
			Error error=new Error(1,"Invalid Username or password");
			
			return new ResponseEntity<Error>(error,HttpStatus.UNAUTHORIZED);
			
		}
		session.setAttribute("userlogged",username);
		session.setAttribute("role",role);
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public void logout(HttpSession session)
	{
		session.removeAttribute("userlogged");
		session.invalidate();
	}
	

}