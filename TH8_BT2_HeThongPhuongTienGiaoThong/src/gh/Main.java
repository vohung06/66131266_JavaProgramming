package gh;

public class Main {

	public static void main(String[] args) {
		PhuongTien pt1 = new PhuongTien();
		pt1.hienThiThongTin();
		
		XeMay xm1 = new XeMay("Honda", 2024, 32000000, 50, "Số");
		System.out.print("\n");
		xm1.hienThiThongTin();
		
		Oto ot1 = new Oto("Toyota", 2025, 400000000, 4, "dầu");
		System.out.print("\n");
		ot1.hienThiThongTin();
	}

}
