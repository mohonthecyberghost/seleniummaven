package com.waltonbd.WebTests;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jTest extends BaseTest {
	
	Logger log = Logger.getLogger(Log4jTest.class);

	public Log4jTest(String url) {
		
		super("http://demo.guru99.com/test/login.html");
	}
	
	
	@Test(priority = 1, enabled = true)
	public void operations() throws Exception {
		log.info("Entering Application Operations");
		
		System.out.println("Log4j Logs...........................");
		
		log.info("Page Title :"+driver.getTitle());
		
		log.warn("This is just a warning message");
		
		log.fatal("This is just a fatal error message");
		
		log.debug("This is just a debug message");
		

	}

}
