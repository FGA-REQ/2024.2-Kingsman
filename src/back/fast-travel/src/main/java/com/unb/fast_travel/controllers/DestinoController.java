package com.unb.fast_travel.controllers;

import com.unb.fast_travel.models.Destino;
import com.unb.fast_travel.repositories.DestinoRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "Destinos", description = "Gerenciamento de destinos")
@RestController
@RequestMapping("/destinos")
public class DestinoController {

	private final DestinoRepository destinoRepository;

	public DestinoController(DestinoRepository destinoRepository) {
		this.destinoRepository = destinoRepository;
	}

	@Operation(summary = "Cria um novo destino")
	@PostMapping
	public ResponseEntity<Destino> criarDestino(@RequestBody Destino destino) {
		return ResponseEntity.ok(destinoRepository.save(destino));
	}

	@Operation(summary = "Lista todos os destinos")
	@GetMapping
	public ResponseEntity<List<Destino>> listarDestinos() {
		return ResponseEntity.ok(destinoRepository.findAll());
	}

	@Operation(summary = "Busca um destino pelo ID")
	@GetMapping("/{id}")
	public ResponseEntity<Destino> buscarDestino(@PathVariable Long id) {
		Optional<Destino> destino = destinoRepository.findById(id);
		return destino.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@Operation(summary = "Deleta um destino pelo ID")
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletarDestino(@PathVariable Long id) {
		destinoRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
