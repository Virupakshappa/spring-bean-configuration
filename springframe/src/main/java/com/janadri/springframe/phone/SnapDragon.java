package com.janadri.springframe.phone;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary           It will prioritize the component "SnapDragon" over "MediaTek"
public class SnapDragon implements MobileProcessor {

	public void process() {
		
		System.out.println("World's best CPU");

	}

}
