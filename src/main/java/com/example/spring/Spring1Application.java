package com.example.spring;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
		/*Spring1Entity user1 = new Spring1Entity(2,"pooja",35);
		Spring1CRUD user1Trans = new Spring1CRUD();
		user1Trans.save(user1);
		user1.addQuery()*/
	}
	
	/*@Bean 
	public CommandLineRunner commandLineRunner( ApplicationContext ctx) {
		return args ->{
			System.out.println("Beans provided by SpringBoot:");
			String [] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String beanName:beanNames) {
				System.out.println(beanName);
			}
		};
	}*/

}
