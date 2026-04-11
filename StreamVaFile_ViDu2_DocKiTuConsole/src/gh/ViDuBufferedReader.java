package gh;

import java.io.*;

public class ViDuBufferedReader {

	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhập chuỗi, giới hạn bởi dấu chấm: ");
		do {
			c = (char)br.read();
			System.out.print(c);
		} while(c != '.');

	}

}
