package gh06;

public class Main {

	public static void main(String[] args) {
		KhachHang kh1 = new KhachHang("KH001", "Nguyễn Khánh Ngân", "0981003057", "13 Lê Lợi, TP. Thủ Đức, TPHCM");
		
		System.out.println(kh1);
		
		TaiKhoan tk1 = new TaiKhoan();
		
		System.out.println(tk1);
		System.out.println(tk1.napTien());
	}

}
