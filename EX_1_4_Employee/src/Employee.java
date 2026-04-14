
public class Employee {
	private int id;
	private String first_name;
	private String last_name;
	private int salary;
	
	public Employee(int id, String first_name, String last_name, int salary) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return first_name;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public String getName() {
		return first_name + " " + last_name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		return salary * 12;
	}
	
	public int raiseSalary(int percent) {
		return salary + salary * percent / 100;
	}
	
	public String toString() {
		return "Nhan vien: [id = " + id + ", ho va ten = " + first_name + " " + last_name + ", luong = " + salary + "]";
		
	}
}
