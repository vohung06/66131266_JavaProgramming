import java.util.Scanner;
public class BaiTap1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so thu nhat: ");
		double num1 = scanner.nextDouble();
		System.out.print("Nhap so thu hai: ");
		double num2 = scanner.nextDouble();
		double sum = num1 + num2;
		System.out.printf("Tong cua %.2f va %.2f la: %.2f", num1, num2, sum);
		scanner.close();
		

	}

}
