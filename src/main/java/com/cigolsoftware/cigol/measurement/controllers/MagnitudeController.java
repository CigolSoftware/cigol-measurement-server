package com.cigolsoftware.cigol.measurement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.cigolsoftware.cigol.measurement.MagnitudeService;
import com.cigolsoftware.cigol.measurement.configurations.Params;
import com.cigolsoftware.cigol.measurement.dto.MagnitudeDto;
import com.cigolsoftware.cigol.measurement.utilities.Constants;
import com.cigolsoftware.cigol.sdk.configurations.ControllerMapping;
import com.cigolsoftware.cigol.sdk.controllers.Controller;
import com.cigolsoftware.cigol.sdk.dto.Body;

@ControllerMapping(Constants.Mapping.MAGNITUDES)
public class MagnitudeController extends Controller<MagnitudeDto, MagnitudeService> {

	@Autowired
	private Params params;

	@GetMapping(Constants.Mapping.FIND_ALL)
	public ResponseEntity<Body<List<MagnitudeDto>>> findAll() {
		final var magnitudes = this.service.findAll();
		return Body.ok(this.params.getMagnitudes().stream().map(mag -> {
			magnitudes.forEach(m -> {
				if (m.getCode() == mag.getCode()) {
					mag.setId(m.getId());
					return;
				}
			});
			return mag;
		}).toList());
	}
}
