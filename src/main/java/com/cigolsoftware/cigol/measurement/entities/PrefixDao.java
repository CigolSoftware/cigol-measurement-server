package com.cigolsoftware.cigol.measurement.entities;

import com.cigolsoftware.cigol.measurement.dto.PrefixDto;
import com.cigolsoftware.cigol.measurement.enums.Prefix;
import com.cigolsoftware.cigol.measurement.utilities.Constants;
import com.cigolsoftware.cigol.sdk.entities.Dao;
import com.cigolsoftware.cigol.sdk.utilities.Tools;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = Constants.Table.MEASUREMENT, name = Constants.Mapping.PREFIXES)
public class PrefixDao extends PrefixDto implements Dao<PrefixDto> {

	@Override
	public PrefixDto dto() {
		return Tools.copyProperties(this, new PrefixDto());
	}

	@Column(name = Constants.Column.CODE_PRE)
	@Enumerated(EnumType.STRING)
	@Override
	public Prefix getCode() {
		return this.code;
	}

	@Column(name = Constants.Column.ID_PRE)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Override
	public Long getId() {
		return this.id;
	}
}
