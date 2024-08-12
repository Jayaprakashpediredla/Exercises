package com.example.Exercises;

import org.springframework.boot.CommandLineRunner;

public class CommandLineRunnerWithSetterInjection implements CommandLineRunner {

	  private DummyLogger dummyLogger;

	  @Override
	  public void run(final String... args) throws Exception {
	    dummyLogger.sayHello();
	  }
	}