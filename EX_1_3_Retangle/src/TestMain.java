
public class TestMain {

	public static void main(String[] args) {
		Rentangle r1 = new Rentangle(1.2f, 3.4f);
	    System.out.println(r1);  
	    Rentangle r2 = new Rentangle();  
	    System.out.println(r2);
	    
	    r1.setLength(5.6f);
	    r1.setWidth(7.8f);
	    System.out.println(r1);  
	    System.out.println("Chieu dai: " + r1.getLength());
	    System.out.println("Chieu rong: " + r1.getWidth());
	    
	    System.out.printf("Dien tich: %.2f%n", r1.getArea());
	    System.out.printf("Chu vi: %.2f%n", r1.getPerimeter());

	}

}
