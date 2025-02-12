package com.unb.fast_travel.controllers;

import com.unb.fast_travel.models.Usuario;
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

@RestController
@RequestMapping("/usuarios")
public class UserController {
	@Autowired
	private UserService userService;

	@Operation(summary = "Criar usuario novo")
	@PostMapping
	public ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario) {
		Usuario newUsuario = userService.save(usuario);
		return new ResponseEntity<>(newUsuario, HttpStatus.CREATED);
	}

	@Operation(summary = "Retorna um usuario pelo id")
	@GetMapping("/id{id}")
	public ResponseEntity<Usuario> getUserById(@PathVariable long id) {
		return userService.findById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	@Operation(summary = "Retorna um usuario pelo email")
	@GetMapping("/{email}")
	public ResponseEntity<Usuario> getUserByEmail(@PathVariable String email) {
		return userService.findByEmail(email)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	@Operation(summary = "Deleta um usuário pelo id")
	@DeleteMapping("/{id}")
	public ResponseEntity<Usuario> deleteUser(@PathVariable long id) {
		userService.delete(id);
		return ResponseEntity.ok().build();
	}
}
