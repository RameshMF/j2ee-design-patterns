package com.ramesh.j2ee.dto;

import java.util.List;

/**
 * The resource class which serves user information.
 * This class act as server in the demo. Which has all customer details.
 */
public class UserResource {
	private List<UserDto> users;

	  /**
	   * @param customers initialize resource with existing customers. Act as database.
	   */
	  public UserResource(List<UserDto> users) {
	    this.users = users;
	  }

	  /**
	   * @return : all customers in list.
	   */
	  public List<UserDto> getAllUsers() {
	    return users;
	  }

	  /**
	   * @param customer save new customer to list.
	   */
	  public void save(UserDto user) {
		  users.add(user);
	  }

	  /**
	   * @param customerId delete customer with id {@code customerId}
	   */
	  public void delete(UserDto user) {
		  users.remove(user);
	  }
}
