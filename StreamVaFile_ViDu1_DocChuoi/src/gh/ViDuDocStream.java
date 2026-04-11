package gh;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException; 

public class ViDuDocStream {

	public static void main(String[] args) throws IOException {
		InputStreamReader ipReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ipReader);
		
		System.out.print("Nhập một chuỗi bất kỳ: ");
		String lineDocDuoc = br.readLine();
		System.out.println("Chuỗi đã nhập: " + lineDocDuoc);
		
	}

}
