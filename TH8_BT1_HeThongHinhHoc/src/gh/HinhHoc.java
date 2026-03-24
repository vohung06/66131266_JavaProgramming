package gh;

public class HinhHoc {
	private String ten;
	private String mauSac;
	
	public HinhHoc() {
		
	}
	
	public HinhHoc(String ten, String mauSac) {
		this.ten = ten;
		this.mauSac = mauSac;
	}
	
	public double tinhDienTich() {
		return 0;
	}
	
	public double tinhChuVi() {
		return 0;
	}
	
	public void hienThiThongTin() {
		System.out.println("Ten: " + ten);
		System.out.println("Mau sac: " + mauSac);
	}
}
