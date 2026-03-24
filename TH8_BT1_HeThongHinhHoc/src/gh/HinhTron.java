package gh;

public class HinhTron extends HinhHoc {
	private double banKinh;
	
	public HinhTron(String ten, String mauSac, double banKinh) {
		super(ten, mauSac);
		this.banKinh = banKinh;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	
	@Override
	public double tinhDienTich() {
		return banKinh * banKinh * Math.PI;
	}
	@Override 
	public double tinhChuVi() {
		return banKinh * 2 * Math.PI;
	}
	@Override
	public void hienThiThongTin() {
	    super.hienThiThongTin();
	    System.out.println("Ban kinh la: " + banKinh);
	    System.out.println("Dien tich: " + tinhDienTich());
	    System.out.println("Chu vi: " + tinhChuVi());
	}
}
