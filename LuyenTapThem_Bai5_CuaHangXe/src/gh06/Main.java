package gh06;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Xe x1 = new Xe("Mecedes", 2, LocalDate.of(2025,10,20), 1000000);
		Xe x2 = new Xe();
		
		x2.nhap();
		
		System.out.println("\n");
		x1.xuat();
		x2.xuat();
		
		

	}

}
