package spring.test1;

import org.springframework.stereotype.Component;

@Component("parrot")
public class Parrot {
	void shoutout() {
		System.out.println("Parrot");
	}
}
