package com.cigolsoftware.cigol.measurement.services;

import org.springframework.stereotype.Service;

import com.cigolsoftware.cigol.measurement.dto.MagnitudeDto;
import com.cigolsoftware.cigol.measurement.entities.MagnitudeDao;
import com.cigolsoftware.cigol.measurement.enums.Magnitude;
import com.cigolsoftware.cigol.measurement.repositories.MagnitudeRepository;

@Service
public class MagnitudeService extends CodeService<MagnitudeDao, Magnitude, MagnitudeRepository, MagnitudeDto> {

}
