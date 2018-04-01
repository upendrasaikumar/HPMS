package com.upendra.hpms.data;

import org.junit.Test;

import pl.pojo.tester.api.assertion.Assertions;

public class UserTest{

	@Test
	public void testUserPojoObject() {
		Assertions.assertPojoMethodsFor(User.class).areWellImplemented();
	}

		
}
