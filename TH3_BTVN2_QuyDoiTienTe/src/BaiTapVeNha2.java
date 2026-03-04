import java.util.Scanner;
public class BaiTapVeNha2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so tien USD: ");
		int usd = scanner.nextInt();
		int vnd = usd * 23500;
		System.out.printf("%d USD = %d VND", usd, vnd);
		scanner.close();
	}

}
