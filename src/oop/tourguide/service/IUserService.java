package oop.tourguide.service;

import oop.tourguide.model.User;
import java.util.logging.Logger;

public interface IUserService {

	/** Initialise logger */
	public static final Logger log = Logger.getLogger(IUserService.class.getName());

	/** Add User for UserDetails table */
	public void addUser(User user);

		/** Update UserDetails table */
	
	//  public void updateUser(User user);
	  
	 /** Remove User from UserDetails table */
	
	  
	//  public void deleteUser(String UserName);
	  
	 /** User Login */
	public boolean getUser(User user);
						 

}
