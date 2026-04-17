package gh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("HoTen.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String line = br.readLine();
			if (line == null)
				break;
			String[] s = line.split(" ");
			
			System.out.println(s[s.length - 1]);
			
		}
		


	}

}
