package gh06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("DanhSachXe.txt");
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<XeVinfast> ds = new ArrayList<>();
		
		while(true) {
			String line = br.readLine();
			if (line == null)
				break;
			
			String s[] = line.split(";");
			XeVinfast temp = new XeVinfast(s[0], Integer.parseInt(s[1]), LocalDate.parse(s[2]), Integer.parseInt(s[3]), s[4]);
			ds.add(temp);			
		}
		
		for (XeVinfast x : ds) {
			x.xuat();
		}
		
		//Sắp xếp theo chiều giảm dần của giá lăn bánh
		for (int i = 0; i < ds.size() - 1; i++) {
		    int max = i;

		    for (int j = i + 1; j < ds.size(); j++) {
		        if (ds.get(j).tinhGiaBan() > ds.get(max).tinhGiaBan()) {
		            max = j;
		        }
		    }

		    XeVinfast temp = ds.get(i);
		    ds.set(i, ds.get(max));
		    ds.set(max, temp);
		}
		
		System.out.println("Danh sách xe sau khi sắp xếp theo chiều giảm dần giá lăn bánh: ");
		for (XeVinfast x : ds) {
			x.xuat();
			System.out.println(" - Giá lăn bánh: " + x.tinhGiaLanBanh());
		}
		
		//Thêm 1 xe vào vị trí p
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vị trí cần thêm: ");
		int p = sc.nextInt();
		if (p < 0 || p > ds.size()) {
			System.out.println("Vị trí không hợp lệ ! Không thể thêm !!!");
		}
		else {
			XeVinfast xe = new XeVinfast();
			xe.nhap();
			ds.add(p, xe);
		}
		
		//Xóa tất cả các xe có dòng xe là x
		System.out.println("Nhập dòng xe cần xóa: ");
		sc.nextLine();
		//duyệt ngược để tránh bỏ sót phần tử tiếp theo
		String xoa = sc.nextLine();
		for (int i = ds.size() - 1; i >= 0; i--) {
		    if (ds.get(i).getDongXe().equals(xoa)) {
		        ds.remove(i);
		    }
		}
		
		br.close();
		fr.close();

	}

}
