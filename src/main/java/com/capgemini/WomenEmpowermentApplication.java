package com.capgemini;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class WomenEmpowermentApplication {
	  private static final Logger LOG=LoggerFactory.getLogger(WomenEmpowermentApplication.class);

	public static void main(String[] args) {
		//SpringApplication.run(ComCgSpringBootDemoApplication.class, args);
		LOG.info("start......");
		SpringApplication.run(WomenEmpowermentApplication.class);
		LOG.info("end");
	}

}
