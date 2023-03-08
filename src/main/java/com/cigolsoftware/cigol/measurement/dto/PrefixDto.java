package com.cigolsoftware.cigol.measurement.dto;

import com.cigolsoftware.cigol.measurement.entities.PrefixDao;
import com.cigolsoftware.cigol.measurement.enums.Prefix;
import com.cigolsoftware.cigol.sdk.utilities.Tools;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PrefixDto extends CodeDto<Prefix, PrefixDao> {

	@Override
	public PrefixDao dao() {
		return Tools.copyProperties(this, new PrefixDao());
	}
}
