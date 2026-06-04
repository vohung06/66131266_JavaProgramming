package gh06;

public class Main {

	public static void main(String[] args) {
		Animal a1 = new Animal("Pig");
		System.out.println(a1);
		
		Mammal m1 = new Mammal("Dolphin");
		System.out.println(m1);
		
		Cat c1 = new Cat("Tom");
		System.out.println(c1);
		c1.greets();
		
		Dog d1 = new Dog("Mymy");
		System.out.println(d1);
		d1.greets();
		d1.greets(d1);
	}

}
