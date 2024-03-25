package com.eazybytes.eazyschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication annotation shows that this is the main class

@EnableAutoConfiguration inside the class that this annotation refers to
tells the Spring framework to configure all inter related dependencies
that are needed by a web application automatically

@ComponentScan - Spring framework scans all classes and packages present
inside the packages and declare the spring beans/configuration of the web application
*/

@SpringBootApplication
public class EazySchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazySchoolApplication.class, args);
	}

}
