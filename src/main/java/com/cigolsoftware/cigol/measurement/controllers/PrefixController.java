package com.cigolsoftware.cigol.measurement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cigolsoftware.cigol.measurement.configurations.Params;
import com.cigolsoftware.cigol.measurement.dto.PrefixDto;
import com.cigolsoftware.cigol.measurement.enums.Prefix;
import com.cigolsoftware.cigol.measurement.services.PrefixService;
import com.cigolsoftware.cigol.measurement.utilities.Constants;
import com.cigolsoftware.cigol.sdk.configurations.ControllerMapping;
import com.cigolsoftware.cigol.sdk.utilities.Tools;

@ControllerMapping(Constants.Mapping.PREFIXES)
public class PrefixController extends CodeController<PrefixDto, Prefix, PrefixService> {

	@Autowired
	private Params params;

	@Override
	protected List<PrefixDto> codes() {
		return Tools.copyProperties(this.params.getPrefixes(), PrefixDto::new);
	}

	@Override
	protected PrefixDto dto() {
		return new PrefixDto();
	}

}
