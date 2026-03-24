package gh;

public class Main {

	public static void main(String[] args) {
		HinhHoc hh1 = new HinhHoc("Hinh Vuong", "Vang");
		hh1.hienThiThongTin();
		
		HinhChuNhat hcn1 = new HinhChuNhat("Hinh Chu Nhat", "Den", 5, 3);
		System.out.print("\n");
		hcn1.hienThiThongTin();
		
		HinhTron ht1 = new HinhTron("Hinh Tron", "Do", 4);
		System.out.print("\n");
		ht1.hienThiThongTin();
		
		HinhTamGiac htg1 = new HinhTamGiac("Hinh Tam Giac", "Hong", 3, 4, 5);
		System.out.print("\n");
		if (htg1.kiemTraHopLe()) {
			System.out.println("Tam giac hop le");
			htg1.hienThiThongTin();
		}
		else
			System.out.println("Tam giac khong hop le");
	}

}
