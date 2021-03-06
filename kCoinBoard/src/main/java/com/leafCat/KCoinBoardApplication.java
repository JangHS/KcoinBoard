package com.leafCat;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KCoinBoardApplication extends SpringBootServletInitializer{
	
	private static Logger logger = Logger.getLogger(KCoinBoardApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KCoinBoardApplication.class, args);
		logger.info("========================== Server Sterted ================================");
	}
}
