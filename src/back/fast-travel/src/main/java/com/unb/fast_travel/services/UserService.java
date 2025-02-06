package com.unb.fast_travel.services;

import com.unb.fast_travel.models.User;
import com.unb.fast_travel.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
	private final UserRepository userRepository;


	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public void delete(Long id) {
		Optional<User> removed = findById(id);
		removed.ifPresent(userRepository::delete);
	}

	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	}

	public Optional<User> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

}
