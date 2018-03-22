package com.project2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.project2.DAO.ProfilePictureDAO;
import com.project2.model.Error;
import com.project2.model.ProfilePicture;

public class ProfilePicController 
{
	@Autowired
	private ProfilePictureDAO profilePictureDao;
	@RequestMapping(value="/uploadprofilepic",method=RequestMethod.POST)
	//directly from html file.
	public ResponseEntity<?> uploadProfilePicture(@RequestParam CommonsMultipartFile image,HttpSession session){
		String username=(String)session.getAttribute("userlogged");
		if(username==null){
			Error error=new Error(4,"Please login");
			
			return new ResponseEntity<Error>(error,HttpStatus.UNAUTHORIZED); //2nd callback function
		}
		ProfilePicture profilePicture=new ProfilePicture();
		profilePicture.setUsername(username);
		profilePicture.setImage(image.getBytes());
		profilePictureDao.addprofilepicture(profilePicture);//insert or update 
		return new ResponseEntity<ProfilePicture>(profilePicture,HttpStatus.OK);
	}
	//<img src="http://localhost:..../middleware/getimage/nameoftheuser" alt="image not found">
	//NO HTTPSTATUS CODE
	//ONLY BYTE[]
	@RequestMapping(value="/getimage/{email:.+}",method=RequestMethod.GET)
	public @ResponseBody byte[] getImage(@PathVariable String email,HttpSession session){
		String username=(String)session.getAttribute("userlogged");
		if(username==null){
			return null;
		}
		
		ProfilePicture profilePicture=profilePictureDao.getProfilePicture(username);
		
		if(profilePicture==null)
			return null;
		
		return profilePicture.getImage();
	}
	

}
