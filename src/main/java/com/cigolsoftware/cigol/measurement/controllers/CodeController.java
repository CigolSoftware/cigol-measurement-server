package com.cigolsoftware.cigol.measurement.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.cigolsoftware.cigol.measurement.dto.CodeDto;
import com.cigolsoftware.cigol.measurement.services.CodeService;
import com.cigolsoftware.cigol.measurement.utilities.Constants;
import com.cigolsoftware.cigol.sdk.controllers.Controller;
import com.cigolsoftware.cigol.sdk.dto.Body;

public abstract class CodeController<D extends CodeDto<?, ?>, S extends CodeService<?, ?, D>> extends Controller<D, S> {

	protected abstract List<D> codes();

	@GetMapping(Constants.Mapping.FIND_ALL)
	public ResponseEntity<Body<List<D>>> findAll() {
		final var all = this.service.findAll();
		return Body.ok(this.codes().stream().map(cod -> {
			all.forEach(c -> {
				if (cod.getCode() == c.getCode()) {
					cod.setId(c.getId());
				}
			});
			return cod;
		}).toList());
	}
}
