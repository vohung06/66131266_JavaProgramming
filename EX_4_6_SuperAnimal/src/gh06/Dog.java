package gh06;

public class Dog extends Mammal{
	public Dog() {
		super();
	}

	public Dog(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog d) {
		System.out.println("Woooof");
	}

	@Override
	public String toString() {
		return "Dog [" + super.toString() + "]";
	}
}
