package spring.test1;

public class Human {
	Dog dog;
	Cat cat;
	Parrot parrot1, parrot2;
	
	public Dog getDog() {
		return this.dog;
	}
	
	public void setDog(Dog _dog) {
		this.dog = _dog;
	}

	public Cat getCat() {
		return this.cat;
	}
	
	public void setCat(Cat _cat) {
		this.cat = _cat;
	}

	public Parrot getParrot1() {
		return this.parrot1;
	}
	
	public void setParrot1(Parrot _parrot) {
		this.parrot1 = _parrot;
	}
	
	public Parrot getParrot2() {
		return this.parrot2;
	}
	
	public void setParrot2(Parrot _parrot) {
		this.parrot2 = _parrot;
	}
	
	public void shoutout() {
		System.out.println("Human");
		dog.shoutout();
		cat.shoutout();
		parrot1.shoutout();
		parrot2.shoutout();
	}
}