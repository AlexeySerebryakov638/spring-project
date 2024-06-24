package spring.test1;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat {
	
	void shoutout() {
		System.out.println("Cat");
	}
}
