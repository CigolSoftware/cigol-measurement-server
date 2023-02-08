package com.cigolsoftware.cigol.measurement.dto;

import com.cigolsoftware.cigol.measurement.entities.MagnitudeDao;
import com.cigolsoftware.cigol.measurement.enums.Magnitude;
import com.cigolsoftware.cigol.sdk.dto.Dto;
import com.cigolsoftware.cigol.sdk.utilities.Tools;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MagnitudeDto extends Dto<MagnitudeDao> {

	protected Magnitude code;

	@Override
	public MagnitudeDao dao() {
		return Tools.copyProperties(this, new MagnitudeDao());
	}

	public Magnitude getCode() {
		return this.code;
	}

	public void setCode(final Magnitude code) {
		this.code = code;
	}

}
