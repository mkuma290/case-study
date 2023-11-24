package com.user.user_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private userInt usr;
	
	@GetMapping("alluser")
	public List<User> getUser(long userId)
	{
		return this.usr.getUser( userId);
	}
}
