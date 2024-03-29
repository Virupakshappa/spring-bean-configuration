package com.janadri.springframe.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired
//	@Qualifier("snapdragon")        This will prioritize the component "SnapDragon" over "MediaTek"
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Octa Core, 8GB RAM, 12MP Cam");
		cpu.process();
	}
}
