import java.util.Scanner;
public class BaiTap2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap can nang (kg): ");
		double weight = scanner.nextDouble();
		System.out.print("Nhap chieu cao (m): ");
		double height = scanner.nextDouble();
		double bmi = weight / (height * height);
		System.out.printf("Can nang: %.1f kg%n", weight);
		System.out.printf("Chhieu cao: %.2f m%n", height);
		System.out.printf("Chi so BMI: %.2f%n", bmi);
		if (bmi < 18.5) 
			System.out.println("-> Thieu can");
		else if (bmi < 25) 
			System.out.println("-> Binh thuong");
		else if (bmi < 30) 
		    System.out.println("-> Thua can");
		else 
		    System.out.println("-> Beo phi");
		scanner.close();
		}
		

	}


