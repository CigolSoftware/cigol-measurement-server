package com.cigolsoftware.cigol.measurement.configurations;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.cigolsoftware.cigol.measurement.dto.MagnitudeDto;
import com.cigolsoftware.cigol.measurement.utilities.Constants;

@Component
@ConfigurationProperties(prefix = Constants.Properties.PARAMS)
public class Params {

	private List<MagnitudeDto> magnitudes;

	public List<MagnitudeDto> getMagnitudes() {
		return this.magnitudes;
	}

	public void setMagnitudes(final List<MagnitudeDto> magnitudes) {
		this.magnitudes = magnitudes;
	}

}
