import java.util.Scanner;
public class PTBac2 {

	public static void main(String[] args) {
		// ax^2 + bx + c = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap a: ");
		int a = scanner.nextInt();
		System.out.print("Nhap b: ");
		int b = scanner.nextInt();
		System.out.print("Nhap c: ");
		int c = scanner.nextInt();
		System.out.printf("Phuong trinh bac 2: %d*x^2 + %d*x + %d = 0\n", a, b, c);
		if (a == 0) {
			if (b == 0) 
				if (c == 0) 
					System.out.println("-> Vo so nghiem");
				else 
					System.out.println("-> Vo nghiem");
			else
				System.out.printf("-> Phuong trinh co nghiem la: -%.2f", (double)- c/b);
		}
		else {
			double denta = b * b - 4 * a * c;
			if (denta < 0)
				System.out.println("-> Vo nghiem");
			else if (denta == 0)
				System.out.printf("-> Phuong trinh co nghiem kep: %.2f", (double)-b / (2 * a));
			else
				System.out.printf("-> Phuong trinh co nghiem la %.2f va %.2f", (-b + Math.sqrt(denta))/(2 * a), (-b - Math.sqrt(denta))/(2 * a));
		}

	}

}
