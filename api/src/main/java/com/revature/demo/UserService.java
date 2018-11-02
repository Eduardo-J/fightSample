package com.revature.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserDao UserDao;

	public User createUser(User user) {
		return UserDao.save(user);
	}

	public Optional<User> getUser(Integer UserId) {
		return UserDao.findById(UserId);
	}

}
