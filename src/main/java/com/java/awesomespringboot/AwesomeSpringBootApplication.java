package com.java.awesomespringboot;

import com.java.awesomespringboot.sub1.SpringComponentDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AwesomeSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(AwesomeSpringBootApplication.class, args);
		SpringComponentDemo componentDemo = applicationContext.getBean(SpringComponentDemo.class);
		System.out.println(componentDemo.getMessage());
		System.out.println("Hello world from main!");
	}

}
