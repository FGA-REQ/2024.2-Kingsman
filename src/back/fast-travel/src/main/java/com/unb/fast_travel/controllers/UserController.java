package com.unb.fast_travel.controllers;

import com.unb.fast_travel.models.User;
import com.unb.fast_travel.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@Operation(summary = "Criar usuario novo")
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User newUser = userService.save(user);
		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}

	@Operation(summary = "Retorna um usuario pelo id")
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable long id) {
		return userService.findById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	@Operation(summary = "Retorna um usuario pelo email")
	@GetMapping("/{email}")
	public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
		return userService.findByEmail(email)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	@Operation(summary = "Deleta um usuário pelo id")
	@DeleteMapping("/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable long id) {
		userService.delete(id);
		return ResponseEntity.ok().build();
	}
}
