package com.Springconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.Springconfiguration.model.Configuration;

@SpringBootApplication
@PropertySource(value = {"classpath:configuration.properties"})
public class SpringconfigurationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringconfigurationApplication.class, args);
		
		Configuration config = applicationContext.getBean(Configuration.class);
		System.out.println(config);
		
	}
	@Bean
	@ConfigurationProperties
	public Configuration config() {
		return new Configuration();
		
	}
}
