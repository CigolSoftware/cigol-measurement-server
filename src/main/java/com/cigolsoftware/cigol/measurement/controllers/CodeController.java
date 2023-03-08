package com.cigolsoftware.cigol.measurement.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cigolsoftware.cigol.measurement.dto.CodeDto;
import com.cigolsoftware.cigol.measurement.services.CodeService;
import com.cigolsoftware.cigol.measurement.utilities.Constants;
import com.cigolsoftware.cigol.sdk.controllers.Controller;
import com.cigolsoftware.cigol.sdk.dto.Body;
import com.cigolsoftware.cigol.sdk.enums.Reply;

public abstract class CodeController<D extends CodeDto<C, ?>, C extends Enum<?>, S extends CodeService<?, C, ?, D>>
		extends Controller<D, S> {

	@GetMapping(Constants.Mapping.CHANGE + Constants.Mapping.CODE)
	public ResponseEntity<Body<Void>> change(@PathVariable final C code) {
		final var byCode = this.service.findByCode(code);
		if (byCode.isPresent()) {
			this.service.delete(byCode.get().getId());
		} else {
			final var dto = this.dto();
			dto.setCode(code);
			this.service.save(dto);
		}
		return Body.ok(Reply.OK);
	}

	protected abstract List<D> codes();

	protected abstract D dto();

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
