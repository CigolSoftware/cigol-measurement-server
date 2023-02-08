package com.cigolsoftware.cigol.measurement.entities;

import com.cigolsoftware.cigol.measurement.dto.MagnitudeDto;
import com.cigolsoftware.cigol.measurement.enums.Magnitude;
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
@Table(schema = Constants.Table.MEASUREMENT, name = Constants.Mapping.MAGNITUDES)
public class MagnitudeDao extends MagnitudeDto implements Dao<MagnitudeDto> {

	@Override
	public MagnitudeDto dto() {
		return Tools.copyProperties(this, new MagnitudeDto());
	}

	@Column(name = Constants.Column.CODE_MAG)
	@Enumerated(EnumType.STRING)
	@Override
	public Magnitude getCode() {
		return this.code;
	}

	@Column(name = Constants.Column.ID_MAG)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Override
	public Long getId() {
		return this.id;
	}
}
