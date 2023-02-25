package com.cigolsoftware.cigol.measurement.services;

import java.util.List;

import com.cigolsoftware.cigol.measurement.dto.CodeDto;
import com.cigolsoftware.cigol.sdk.entities.Dao;
import com.cigolsoftware.cigol.sdk.repositories.Repository;
import com.cigolsoftware.cigol.sdk.services.DaoService;

public class CodeService<A extends Dao<T>, R extends Repository<A>, T extends CodeDto<?, A>>
		extends DaoService<A, R, T> {

	public List<T> findAll() {
		return this.repository.findAll().stream().map(A::dto).toList();
	}

}
