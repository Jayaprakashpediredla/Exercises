package com.example.Exercises;

/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DummyLogger implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(DummyLogger.class);
	
	@Override
	public void run(final String... args) throws Exception{
		
		log.info("Hello from Exercise 1");
	}
}  */

import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DummyLogger {
	
	private static final Logger log = LoggerFactory.getLogger(DummyLogger.class);
	
  public void sayHello() {
    log.info("hello from DummyLogger");
  }
}