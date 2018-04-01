package com.upendra.hpms.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.upendra.hpms.data.User;

public class UserDAOTest {
	
	@Test
	public void createUserTest() {
		UserDAO userDao = new UserDAOImpl();
		assertNotNull(userDao.createUser(new User()));
	}
	
	@Test
	public void findByPropertyTest() {
		UserDAO userDao = new UserDAOImpl();
		String propertyName ="";
		Object propertyValue = null;
		assertNotNull(userDao.findByProperty(propertyName,propertyValue));
	}
	
	@Test
	public void updateUserTest() {
		UserDAO userDao = new UserDAOImpl();
		String propertyName ="";
		Object propertyValue = null;
		List<User> listOfUsers = userDao.findByProperty(propertyName,propertyValue);
		User user = listOfUsers.get(0);
		user.setActiveStatus(!user.isActiveStatus());
		assertNotNull(userDao.UpdateUser(user));
	}
	
	@Test
	public void deleteUserTest() {
		UserDAO userDao = new UserDAOImpl();
		String propertyName ="";
		Object propertyValue = null;
		List<User> listOfUsers = userDao.findByProperty(propertyName,propertyValue);
		User user = listOfUsers.get(0);
		assertTrue(userDao.deleteUser(user));
	}

}
