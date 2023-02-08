package com.cigolsoftware.cigol.measurement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cigolsoftware.cigol.sdk.utilities.ConstantsSDK;

@ComponentScan(ConstantsSDK.Application.PACKAGES)
@SpringBootApplication
public class MeasurementApplication {

	public static void main(final String[] args) {
		SpringApplication.run(MeasurementApplication.class, args);
	}

}
