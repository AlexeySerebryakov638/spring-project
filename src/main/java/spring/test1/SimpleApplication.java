package spring.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import spring.test1.Human;

@Configuration
@ImportResource("classpath:applicationContext.xml")
public class SimpleApplication implements CommandLineRunner {

	@Autowired
	Human human;
	
	@Override
	public void run(String... args) {
		human.shoutout();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SimpleApplication.class, args);
	}
}
