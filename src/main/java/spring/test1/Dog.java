package spring.test1;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog {
	void shoutout() {
		System.out.println("Dog");
	}
}
