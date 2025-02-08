package com.unb.fast_travel.repositories;

import com.unb.fast_travel.models.PontoTuristico;
import com.unb.fast_travel.models.TipoInteresse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PontoRepository extends JpaRepository<PontoTuristico, Long> {
	List<PontoTuristico> findByDestinoId(Long destinoId);

	List<PontoTuristico> findByDestinoIdAndTipoInteresse(Long destinoId, TipoInteresse tipo);
}
