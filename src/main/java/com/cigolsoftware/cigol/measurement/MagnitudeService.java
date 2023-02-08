package com.cigolsoftware.cigol.measurement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cigolsoftware.cigol.measurement.dto.MagnitudeDto;
import com.cigolsoftware.cigol.measurement.entities.MagnitudeDao;
import com.cigolsoftware.cigol.measurement.repository.MagnitudeRepository;
import com.cigolsoftware.cigol.sdk.services.DaoService;

@Service
public class MagnitudeService extends DaoService<MagnitudeDao, MagnitudeRepository, MagnitudeDto> {

	public List<MagnitudeDto> findAll() {
		return this.repository.findAll().stream().map(MagnitudeDao::dto).toList();
	}

}
