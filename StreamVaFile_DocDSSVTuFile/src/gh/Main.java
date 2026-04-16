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
			String[] s = line.split("; ");
			SinhVien sv = new SinhVien(s[0], s[1], s[2], s[3]);
		
		}
		

	}

}
