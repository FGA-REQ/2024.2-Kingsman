package com.unb.fast_travel.controllers;

import com.unb.fast_travel.models.PontoTuristico;
import com.unb.fast_travel.models.TipoInteresse;
import com.unb.fast_travel.repositories.DestinoRepository;
import com.unb.fast_travel.repositories.PontoRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "Spots", description = "Gerenciamento de pontos turísticos")
@RestController
@RequestMapping("/spots")
public class PontoController {
	@Autowired
	private PontoRepository pontoRepository;

	@Autowired
	private DestinoRepository destinoRepository;

	@Operation(summary = "Cria um novo ponto turístico dentro de um destino e categoria")
	@PostMapping("/{destinoId}")
	public ResponseEntity<PontoTuristico> criarPontoTuristico(@PathVariable Long destinoId, @RequestParam TipoInteresse tipo, @RequestBody PontoTuristico local) {
		return destinoRepository.findById(destinoId).map(destino -> {
			local.setDestino(destino);
			local.setTipoInteresse(tipo);
			return ResponseEntity.ok(pontoRepository.save(local));
		}).orElse(ResponseEntity.notFound().build());
	}

	@Operation(summary = "Lista todos os pontos turísticos")
	@GetMapping
	public ResponseEntity<List<PontoTuristico>> listarTodosLocais() {
		return ResponseEntity.ok(pontoRepository.findAll());
	}

	@Operation(summary = "Lista pontos turísticos de um destino específico")
	@GetMapping("/destino/{destinoId}")
	public ResponseEntity<List<PontoTuristico>> listarLocaisPorDestino(@PathVariable Long destinoId) {
		return ResponseEntity.ok(pontoRepository.findByDestinoId(destinoId));
	}

	@Operation(summary = "Lista pontos turísticos por destino e interesse")
	@GetMapping("/destino/{destinoId}/{tipo}")
	public ResponseEntity<List<PontoTuristico>> listarLocaisPorDestinoEInteresse(@PathVariable Long destinoId, @PathVariable TipoInteresse tipo) {
		return ResponseEntity.ok(pontoRepository.findByDestinoIdAndTipoInteresse(destinoId, tipo));
	}

	@Operation(summary = "Busca um ponto turístico pelo ID")
	@GetMapping("/{id}")
	public ResponseEntity<PontoTuristico> buscarPontoTuristicoPorId(@PathVariable Long id) {
		Optional<PontoTuristico> local = pontoRepository.findById(id);
		return local.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@Operation(summary = "Atualiza um ponto turístico")
	@PutMapping("/{id}")
	public ResponseEntity<PontoTuristico> atualizarPontoTuristico(@PathVariable Long id, @RequestBody PontoTuristico novoPontoTuristico) {
		return pontoRepository.findById(id).map(local -> {
			local.setNome(novoPontoTuristico.getNome());
			local.setEndereco(novoPontoTuristico.getEndereco());
			local.setDescricao(novoPontoTuristico.getDescricao());
			local.setImagemUrl(novoPontoTuristico.getImagemUrl());
			return ResponseEntity.ok(pontoRepository.save(local));
		}).orElse(ResponseEntity.notFound().build());
	}

	@Operation(summary = "Deleta um ponto turístico pelo ID")
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletarPontoTuristico(@PathVariable Long id) {
		pontoRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
