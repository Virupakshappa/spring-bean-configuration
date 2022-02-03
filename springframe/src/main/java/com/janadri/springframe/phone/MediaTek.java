package com.janadri.springframe.phone;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {

	public void process() {
		System.out.println("World's second best CPU");

	}

}
