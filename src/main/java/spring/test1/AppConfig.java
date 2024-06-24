package spring.test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Human human() {
		return new Human();
	}
	
	@Bean
	public Dog dog() {
		return new Dog();
	}
	
	@Bean
	public Cat cat() {
		return new Cat();
	}
	
	@Bean
	public Parrot parrot() {
		return new Parrot();
	}
}
