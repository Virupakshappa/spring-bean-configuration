package com.janadri.springframe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.janadri.springframe.phone.MobileProcessor;
import com.janadri.springframe.phone.Samsung;
import com.janadri.springframe.phone.SnapDragon;

@Configuration
public class AppConfig {

	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getProcessor() {
		return new SnapDragon();
	}
}
