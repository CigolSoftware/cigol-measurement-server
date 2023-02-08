package com.cigolsoftware.cigol.measurement.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cigolsoftware.cigol.measurement.configurations.Params;
import com.cigolsoftware.cigol.measurement.dto.MagnitudeDto;
import com.cigolsoftware.cigol.measurement.enums.Magnitude;
import com.cigolsoftware.cigol.measurement.services.MagnitudeService;
import com.cigolsoftware.cigol.measurement.utilities.Constants;
import com.cigolsoftware.cigol.sdk.configurations.ControllerMapping;
import com.cigolsoftware.cigol.sdk.controllers.Controller;
import com.cigolsoftware.cigol.sdk.dto.Body;
import com.cigolsoftware.cigol.sdk.enums.Reply;
import com.cigolsoftware.cigol.sdk.utilities.Tools;

@ControllerMapping(Constants.Mapping.MAGNITUDES)
public class MagnitudeController extends Controller<MagnitudeDto, MagnitudeService> {

	@Autowired
	private Params params;

	@GetMapping(Constants.Mapping.CHANGE + Constants.Mapping.MAGNITUDE)
	public ResponseEntity<Body<Void>> change(@PathVariable final Magnitude magnitude) {
		final var code = this.service.findByCode(magnitude);
		if (Optional.ofNullable(code).isPresent()) {
			this.service.delete(code.getId());
		} else {
			final var dto = new MagnitudeDto();
			dto.setCode(magnitude);
			this.service.save(dto);
		}
		return Body.ok(Reply.OK);
	}

	@GetMapping(Constants.Mapping.FIND_ALL)
	public ResponseEntity<Body<List<MagnitudeDto>>> findAll() {
		final var all = this.service.findAll();
		return Body.ok(Tools.copyProperties(this.params.getMagnitudes(), MagnitudeDto::new).stream().map(mag -> {
			all.forEach(m -> {
				if (m.getCode() == mag.getCode()) {
					mag.setId(m.getId());
				}
			});
			return mag;
		}).toList());
	}
}
