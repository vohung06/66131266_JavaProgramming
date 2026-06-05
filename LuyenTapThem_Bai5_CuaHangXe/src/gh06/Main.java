package gh06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

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
		    int min = i;

		    for (int j = i + 1; j < ds.size(); j++) {
		        if (ds.get(j).tinhGiaBan() < ds.get(min).tinhGiaBan()) {
		            min = j;
		        }
		    }

		    XeVinfast temp = ds.get(i);
		    ds.set(i, ds.get(min));
		    ds.set(min, temp);
		}
		
		System.out.println("Danh sách xe sau khi sắp xếp theo chiều giảm dần giá lăn bánh: ");
		for (XeVinfast x : ds) {
			x.xuat();
			System.out.println(" - Giá lăn bánh: " + x.tinhGiaLanBanh());
		}
		

	}

}
