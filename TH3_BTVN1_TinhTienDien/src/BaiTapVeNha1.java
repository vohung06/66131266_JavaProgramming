import java.util.Scanner;
public class BaiTapVeNha1 {

	public static void main(String[] args) {
		/* Tính tiền điện theo bậc thang:
        - 0-50 kWh: 1,678 đ/kWh
        - 51-100 kWh: 1,734 đ/kWh
        - 101-200 kWh: 2,014 đ/kWh
        - 201-300 kWh: 2,536 đ/kWh
        - Trên 300 kWh: 2,834 đ/kWh
     */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so kWh da dung: ");
		int soDien = scanner.nextInt();
		int tienDien;
		
		if (soDien <= 50) 
	            tienDien = soDien * 1678;
	    else if (soDien <= 100)
	            tienDien = 50 * 1678 + (soDien - 50) * 1734;
	    else if (soDien <= 200) 
	            tienDien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
	    else if (soDien <= 300) 
	            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
	    else 
	            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
	    System.out.printf("Tien dien phai tra: %d", tienDien);
	    scanner.close();
	}

}
