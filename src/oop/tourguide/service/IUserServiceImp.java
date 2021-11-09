package oop.tourguide.service;

import oop.tourguide.model.User;
import oop.tourguide.util.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;


public class IUserServiceImp implements IUserService  {
	
	public static final Logger log = Logger.getLogger(IUserService.class.getName());
	
	private static Connection connection;
	//private static Statement statement;
	private static PreparedStatement preparedStatement;
	
	public void addUser(User user) {
		
		try {
		connection = DBconnection.con();
		
		preparedStatement = connection.prepareStatement("insert into userdetails values(?,?,?,?,?,?,?)");
		
		preparedStatement.setString(1, user.getFirstName());
		preparedStatement.setString(2, user.getLastName());
		preparedStatement.setString(3, user.getUserName());
		preparedStatement.setString(4, user.getAddress());
		preparedStatement.setString(5, user.getMobile());
		preparedStatement.setString(6, user.getEmail());
		preparedStatement.setString(7, user.getPassword());
		
		preparedStatement.executeUpdate();
		
		}
		catch(Exception e) {
		log.log(Level.SEVERE, e.getMessage());	
	}
		 finally {
				
				try {
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					log.log(Level.SEVERE, e.getMessage());
				}
			}
}
	
	public boolean getUser(User user) {
		boolean status = false;
		try {
			connection = DBconnection.con();
			
			preparedStatement = connection.prepareStatement("select * from userdetails where UserName = ? and Password = ?");
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			
			ResultSet result = preparedStatement.executeQuery();
			status = result.next();
			
		}
		catch(Exception e) {
			log.log(Level.SEVERE, e.getMessage());		
		}
		return status;
	}

	/*
	 * public void updateUser(User user) {
	 * 
	 * User user = null; try {
	 * 
	 * connection = DBconnection.con();
	 * 
	 * preparedStatement =
	 * connection.prepareStatement("select * from userdetails where UserName = ?");
	 * 
	 * ResultSet result = preparedStatement.executeQuery(); while(result.next()) {
	 * String fname = result.getString(columnLabel) } } }
	 */
}
