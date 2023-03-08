package com.cigolsoftware.cigol.measurement.configurations;

import java.util.Optional;

import com.cigolsoftware.cigol.sdk.entities.Dao;
import com.cigolsoftware.cigol.sdk.repositories.Repository;

public interface CodeRepository<C extends Enum<?>, D extends Dao<?>> extends Repository<D> {

	Optional<D> findByCode(C code);
}
