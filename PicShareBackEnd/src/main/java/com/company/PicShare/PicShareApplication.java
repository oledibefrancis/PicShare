package com.company.PicShare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PicShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicShareApplication.class, args);
	}

}
