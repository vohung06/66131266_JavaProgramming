package gh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("SV.csv");
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
		
		while(true) {
			String line = br.readLine();
			if (line == null)
				break;
			String[] s = line.split("; ");
			SinhVien sv = new SinhVien(Integer.parseInt(s[0]), s[1], Integer.parseInt(s[2]), s[3]);
			ds.add(sv);
		}
		
		System.out.printf("%-5s %-20s %-10s %-10s\n", "STT", "Họ tên", "Năm sinh", "Giới tính");
		for (SinhVien sv : ds) {
			System.out.println(sv);
		}
		

	}

}
