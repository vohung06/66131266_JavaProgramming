
public class TestMain {

	public static void main(String[] args) {
		Employee e1 = new Employee(8, "Vo", "Hung", 2500);
	    System.out.println(e1);
	    
	    e1.setSalary(1000);
	    System.out.println(e1);  
	    System.out.println("Ma id: " + e1.getId());
	    System.out.println("Ho: " + e1.getFirstName());
	    System.out.println("Ten: " + e1.getLastName());
	    System.out.println("Luong: " + e1.getSalary());
	    System.out.println("Ho va ten: " + e1.getName());
	    System.out.println("Luong mot nam: " + e1.getAnnualSalary());
	    System.out.println(e1.raiseSalary(10));
	    System.out.println(e1);
	}

}
