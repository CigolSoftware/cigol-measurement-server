package com.cigolsoftware.cigol.measurement.dto;

import com.cigolsoftware.cigol.sdk.dto.Dto;

public abstract class CodeDto<C extends Enum<?>, D> extends Dto<D> {

	protected C code;

	public C getCode() {
		return this.code;
	}

	public void setCode(final C code) {
		this.code = code;
	}

}
