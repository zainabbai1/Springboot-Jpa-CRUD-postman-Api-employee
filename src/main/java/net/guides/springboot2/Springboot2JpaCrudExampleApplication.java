package net.guides.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Springboot2JpaCrudExampleApplication
{
	public static void main(String[] args) 
	{
		SpringApplication.run(Springboot2JpaCrudExampleApplication.class, args);
	}

}
