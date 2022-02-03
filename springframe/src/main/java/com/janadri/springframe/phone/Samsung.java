package com.janadri.springframe.phone;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

	@Autowired
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
