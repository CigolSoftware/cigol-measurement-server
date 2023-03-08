package com.cigolsoftware.cigol.measurement.services;

import java.util.List;
import java.util.Optional;

import com.cigolsoftware.cigol.measurement.configurations.CodeRepository;
import com.cigolsoftware.cigol.measurement.dto.CodeDto;
import com.cigolsoftware.cigol.sdk.entities.Dao;
import com.cigolsoftware.cigol.sdk.services.DaoService;

public class CodeService<A extends Dao<T>, C extends Enum<?>, R extends CodeRepository<C, A>, T extends CodeDto<C, A>>
		extends DaoService<A, R, T> {

	public List<T> findAll() {
		return this.repository.findAll().stream().map(A::dto).toList();
	}

	public Optional<T> findByCode(final C code) {
		return this.repository.findByCode(code).stream().map(Dao::dto).findAny();
	}

}
