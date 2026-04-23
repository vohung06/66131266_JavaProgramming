package thigk2.votrangiahung;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập thông tin toạ độ góc Trên - Trái của hình chữ nhật: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.println("Nhập thông tin toạ độ góc Dưới - Phải của hình chữ nhật: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		System.out.println("Toạ độ góc Trên - Trái: (" + x1 + ", " + y1 + ")");
		System.out.println("Toạ độ góc Dưới - Phải: (" + x2 + ", " + y2 + ")");
		
		double canh1 = Math.abs(x2 - x1);
		double canh2 = Math.abs(y2 - y1);
		double dienTich = canh1 * canh2;
		
		System.out.println("=> Dien tich hinh chu nhat la: " + dienTich);
		
		double chuVi = (canh1 + canh2) * 2;
		System.out.println("=> Chu vi hinh chu nhat la: " + chuVi);
	}

}
