package gh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViDuBufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Nhap chuoi. Nhập 'stop' để kết thúc: ");
		do
		{
			str = br.readLine();
			System.out.println(str);
		} while(!str.equals("stop"));

	}

}
