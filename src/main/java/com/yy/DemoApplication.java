package com.yy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	//bilibili 手把手带你复现log4j史诗级漏洞
	
	//https://stackoverflow.com/questions/52385610/java-class-cast-exception-spring-boot  Hieu Nguyen
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
