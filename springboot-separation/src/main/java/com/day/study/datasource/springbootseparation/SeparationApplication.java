package com.day.study.datasource.springbootseparation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fengyu
 */
@SpringBootApplication
@MapperScan("com.day.study.datasource.springbootseparation.mapper")
public class SeparationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeparationApplication.class, args);
		System.out.println("OK!!!!");
	}

}
