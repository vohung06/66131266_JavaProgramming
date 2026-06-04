package gh06;

public class Cat extends Mammal {

	public Cat() {
		super();
	}

	public Cat(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Meow");
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + "]";
	}
	
	
	
	
	
}
