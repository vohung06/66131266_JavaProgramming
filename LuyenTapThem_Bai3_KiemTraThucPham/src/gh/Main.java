package gh;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		ThucPham tp1 = new ThucPham("A001", "Bánh Oreo", 17000, LocalDate.of(2025, 12, 3), LocalDate.of(2027, 12, 3));
		
		System.out.println(tp1.toString());

	}

}
