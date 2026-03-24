package gh;

public class Main {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("001", "Vo Tran Gia Hung", 120000);
		nv1.hienThiThongTin();
		System.out.println(nv1);
		
		NhanVienVanPhong nvvp1 = new NhanVienVanPhong("002", "Nguyen Khanh Ngan", 120000, 3, 150000);
		System.out.println(nvvp1);
		//nvvp1.hienThiThongTin();
	}

}
