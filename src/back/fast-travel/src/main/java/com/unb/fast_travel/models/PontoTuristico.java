package com.unb.fast_travel.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "pontos_turisticos")
@NoArgsConstructor
@AllArgsConstructor
public class PontoTuristico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String endereco;

	@Column(nullable = false, length = 1000)
	private String descricao;

	@Column(nullable = false)
	private String imagemUrl;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoInteresse tipoInteresse;

	@ManyToOne
	@JoinColumn(name = "destino_id", nullable = false)
	private Destino destino;
}
