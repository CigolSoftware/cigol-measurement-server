package com.cigolsoftware.cigol.measurement.services;

import org.springframework.stereotype.Service;

import com.cigolsoftware.cigol.measurement.dto.PrefixDto;
import com.cigolsoftware.cigol.measurement.entities.PrefixDao;
import com.cigolsoftware.cigol.measurement.repository.PrefixRepository;

@Service
public class PrefixService extends CodeService<PrefixDao, PrefixRepository, PrefixDto> {

}
