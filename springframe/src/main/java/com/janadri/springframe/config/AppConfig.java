package com.janadri.springframe.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages= {"com.janadri.springframe.config","com.janadri.springframe.phone","com.janadri.springframe"})
@Configuration
public class AppConfig {

}
