package com.janadri.springframe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.janadri.springframe.config.AppConfig;
import com.janadri.springframe.phone.Samsung;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
