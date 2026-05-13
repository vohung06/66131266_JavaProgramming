package gh;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		ThucPham tp1 = new ThucPham("A001", "Bánh Oreo", 17000, LocalDate.of(2025, 12, 3), LocalDate.of(2027, 12, 3));
        ThucPham tp2 = new ThucPham("A002", "Bánh Nabati", 25000, LocalDate.of(2024, 12, 10), LocalDate.of(2026, 5, 10));
               
        System.out.println("===== THÔNG TIN SẢN PHẨM =====");

        System.out.println(tp1);
        if (tp1.kiemTraHSD())
        	System.out.println("-> Còn hạn.");
        else
        	System.out.println("-> Hết hạn.");

        System.out.println();

        System.out.println(tp2);
        if (tp2.kiemTraHSD())
        	System.out.println("-> Còn hạn.");
        else
        	System.out.println("-> Hết hạn.");
    }

	

}
