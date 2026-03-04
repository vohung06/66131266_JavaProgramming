import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma sinh vien: ");
        String id = scanner.nextLine();
        System.out.print("Ho ten: ");
        String name = scanner.nextLine();
        System.out.print("Diem Toan: ");
        double math = scanner.nextDouble();
        System.out.print("Diem Ly: ");
        double physics = scanner.nextDouble();
        System.out.print("Diem Hoa: ");
        double chemistry = scanner.nextDouble();
        double average = (math + physics + chemistry) / 3;
        try {
            FileWriter writer = new FileWriter("students.txt", true);
            writer.write("THONG TIN SINH VIEN \n");
            writer.write("Ma SV: " + id + "\n");
            writer.write("Ho ten: " + name + "\n");
            writer.write(String.format("Diem Toan: %.1f\n", math));
            writer.write(String.format("Diem Ly: %.1f\n", physics));
            writer.write(String.format("Diem Hoa: %.1f\n", chemistry));
            writer.write(String.format("Diem TB: %.2f\n", average));
            writer.close();
            
            System.out.println("\nĐã lưu thông tin vào file students.txt");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
        scanner.close();
    }
}
