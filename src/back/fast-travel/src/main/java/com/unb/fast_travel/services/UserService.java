package com.unb.fast_travel.services;

import com.unb.fast_travel.models.Usuario;
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

	public Usuario save(Usuario usuario) {
		return userRepository.save(usuario);
	}

	public void delete(Long id) {
		Optional<Usuario> removed = findById(id);
		removed.ifPresent(userRepository::delete);
	}

	public Optional<Usuario> findById(Long id) {
		return userRepository.findById(id);
	}

	public Optional<Usuario> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	public List<Usuario> findAll() {
		return userRepository.findAll();
	}

}
