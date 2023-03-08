package com.cigolsoftware.cigol.measurement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cigolsoftware.cigol.measurement.configurations.Params;
import com.cigolsoftware.cigol.measurement.dto.MagnitudeDto;
import com.cigolsoftware.cigol.measurement.enums.Magnitude;
import com.cigolsoftware.cigol.measurement.services.MagnitudeService;
import com.cigolsoftware.cigol.measurement.utilities.Constants;
import com.cigolsoftware.cigol.sdk.configurations.ControllerMapping;
import com.cigolsoftware.cigol.sdk.utilities.Tools;

@ControllerMapping(Constants.Mapping.MAGNITUDES)
public class MagnitudeController extends CodeController<MagnitudeDto, Magnitude, MagnitudeService> {

	@Autowired
	private Params params;

	@Override
	protected List<MagnitudeDto> codes() {
		return Tools.copyProperties(this.params.getMagnitudes(), MagnitudeDto::new);
	}

	@Override
	protected MagnitudeDto dto() {
		return new MagnitudeDto();
	}

}
