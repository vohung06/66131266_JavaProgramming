package gh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PhanSo ps1 = new PhanSo();
		PhanSo ps2 = new PhanSo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập phân số thứ 1: ");
		System.out.print(" - Nhập tử số: ");
		ps1.setTu(sc.nextInt());
		System.out.print(" - Nhập mẫu số: ");
		ps1.setMau(sc.nextInt());
		
		System.out.println("Nhập phân số thứ 2: ");
		System.out.print(" - Nhập tử số: ");
		ps2.setTu(sc.nextInt());
		System.out.print(" - Nhập mẫu số: ");
		ps2.setMau(sc.nextInt());
		
		ps1.rutGon();
		ps2.rutGon();
		System.out.println("\nPhân số thứ 1: " + ps1);
		System.out.println("Phân số thứ 2: " + ps2);
		
		System.out.println("\n1. Cong   2. Tru   3. Nhan   4. Chia");
		System.out.print("Nhập lựa chọn: ");
		int choice = sc.nextInt();
		PhanSo kq = null;
		switch (choice) {
		    case 1:
		        kq = ps1.cong2PS(ps2);
		        break;
		    case 2:
		        kq = ps1.tru2PS(ps2);
		        break;
		    case 3:
		        kq = ps1.nhan2PS(ps2);
		        break;
		    case 4:
		        kq = ps1.chia2PS(ps2);
		        break;
		    default:
		        System.out.println("Lua chon khong hop le");
		}

		if (kq != null) {
		    System.out.println("Ket qua: " + kq);
		}
		else
			System.out.println("Lỗi phép toán !!!");
	}

}
