package com.janadri.springframe.phone;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	public void process() {
		
		System.out.println("World's best CPU");

	}

}
