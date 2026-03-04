import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BaiTapVeNha3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hay nhap noi dung dien vao nhap ky: ");
        String noiDung = scanner.nextLine();
        try {
        	FileWriter writer = new FileWriter("nhatky.txt", true);
        	writer.write(noiDung + "\n");
        	writer.close();
        }
        catch (IOException e) {
        	System.out.println("Loi ghi file: " + e.getMessage());
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("nhatky.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Loi doc file: " + e.getMessage());
        }
        scanner.close();

	}

}
