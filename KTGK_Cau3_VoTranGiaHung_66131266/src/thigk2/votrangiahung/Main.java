package thigk2.votrangiahung;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//em dùng lớp FileReader và BufferedReader để đọc từ file, sau đó dùng ArrayList để lưu giá trị để kiểm tra X có xuất hiện trong các số 

public class Main {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("SoThuc.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//không dùng double là kiểu nguyên thuỷ, dùng lớp bao
		ArrayList<Double> ds = new ArrayList<Double>();
		
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			double x = Double.parseDouble(line);
			//lưu vào arraylist để dễ cho việc kiểm tra giá trị X
			ds.add(x);
			//in ngay sau khi đã đọc được số đó
			System.out.println(x);
		}
		
		double X = 10; //ngày sinh của em
		
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i) == X)
				System.out.printf("%.0f có xuất hiện trong danh sách", X);
		}
		

	}

}
