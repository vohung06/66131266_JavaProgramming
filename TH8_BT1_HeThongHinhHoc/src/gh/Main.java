package gh;

public class Main {

	public static void main(String[] args) {
		HinhHoc hh1 = new HinhHoc("Hinh Vuong", "Vang");
		hh1.hienThiThongTin();
		
		HinhChuNhat hcn1 = new HinhChuNhat("Hinh Chu Nhat", "Den", 5, 3);
		System.out.print("\n");
		hcn1.hienThiThongTin();
	}

}
