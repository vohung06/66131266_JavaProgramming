package gh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//2a. Tạo mới 2 học sinh, hard code dữ liệu
		HocSinh hs1 = new HocSinh();
		String tenHS1 = "Nguyễn Hoàng Việt";
		hs1.setTenHS(tenHS1);
		short tuoiHS1 = 10;
		hs1.setTuoiHS(tuoiHS1);
		String lopHS1 = "5A";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2 = new HocSinh("Trần Phương Anh", (short)10, "5A");
		//In ra màn hình
		System.out.println(hs1);
		System.out.println(hs2);
		
		//2b. Nhập dữ liệu
		Scanner sc = new Scanner(System.in);
		HocSinh hs3 = new HocSinh();
		System.out.print("Nhập tên của HS thứ 3: ");
		String tenHS3 =  sc.nextLine();
		hs3.setTenHS(tenHS3);
		System.out.print("Nhập tuổi của HS thứ 3: ");
		short tuoiHS3 =  sc.nextShort();
		sc.nextLine();
		hs3.setTuoiHS(tuoiHS3);
		System.out.print("Nhập lớp của HS thứ 3: ");
		String lopHS3 =  sc.nextLine();
		hs3.setLopHS(lopHS3);
		
		HocSinh hs4 = new HocSinh();
		System.out.print("\nNhập tên của HS thứ 4: ");
		String tenHS4 =  sc.nextLine();
		hs4.setTenHS(tenHS4);
		System.out.print("Nhập tuổi của HS thứ 4: ");
		short tuoiHS4 =  sc.nextShort();
		sc.nextLine();
		hs4.setTuoiHS(tuoiHS4);
		System.out.print("Nhập lớp của HS thứ 4: ");
		String lopHS4 =  sc.nextLine();
		hs4.setLopHS(lopHS4);
		
		System.out.println(hs3);
		System.out.println(hs4);
		
		//Nhập danh sách N học sinh
		ArrayList<HocSinh> ds = new ArrayList<HocSinh>();
		System.out.println("Nhập N: ");
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			HocSinh hsi = new HocSinh();	
			System.out.printf("Nhập tên của HS thứ %d: ", i + 1);
			String tenHSi =  sc.nextLine();
			hsi.setTenHS(tenHSi);
			System.out.printf("Nhập tuổi của HS thứ %d: ", i + 1);
			short tuoiHSi =  sc.nextShort();
			sc.nextLine();
			hsi.setTuoiHS(tuoiHSi);
			System.out.printf("Nhập lớp của HS thứ %d: ", i + 1);
			String lopHSi =  sc.nextLine();
			hsi.setLopHS(lopHSi);
			ds.add(hsi); //Đưa vào danh sách
		}
		//In ra danh sách học sinh
		for (int i = 0; i < N; i++) {
			System.out.println(ds.get(i).toString());
		}
		
		//Bổ sung thêm 1 học sinh
		HocSinh hsthem = new HocSinh("Huỳnh Gia Kiệt", (short)10, "5E");
		ds.add(hsthem);
		System.out.println("Danh sách HS sau khi thêm 1 HS: ");
		for (HocSinh hs:ds) {
			System.out.println(hs);
		}
		
		//Xoá sinh viên
		System.out.println("Danh sách HS sau khi xoá 1 HS tên Hoa: ");
//		for (int i = 0; i < N; i++) {
//			HocSinh hstam = ds.get(i);
//			if (hstam.getTenHS() == "Hoa") {
//				ds.remove(hstam);
//				break;
//			}
//		}
		for (int i = 0; i < ds.size(); i++) {
		    if (ds.get(i).getTenHS().equals("Hoa")) {
		        ds.remove(i);
		        break;
		    }
		}


		for (HocSinh hs:ds) {
			System.out.println(hs);
		}
		
		
	}

}
