package com.cigolsoftware.cigol.measurement.configurations;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.cigolsoftware.cigol.measurement.dto.MagnitudeDto;
import com.cigolsoftware.cigol.measurement.dto.PrefixDto;
import com.cigolsoftware.cigol.measurement.utilities.Constants;

@Component
@ConfigurationProperties(prefix = Constants.Properties.PARAMS)
public class Params {

	private List<MagnitudeDto> magnitudes;
	private List<PrefixDto> prefixes;

	public List<MagnitudeDto> getMagnitudes() {
		return this.magnitudes;
	}

	public List<PrefixDto> getPrefixes() {
		return this.prefixes;
	}

	public void setMagnitudes(final List<MagnitudeDto> magnitudes) {
		this.magnitudes = magnitudes;
	}

	public void setPrefixes(final List<PrefixDto> prefixes) {
		this.prefixes = prefixes;
	}

}
