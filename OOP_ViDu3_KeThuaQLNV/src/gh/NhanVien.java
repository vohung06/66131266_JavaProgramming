package gh;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private double luongCoBan;
	
	public NhanVien() {
		
	}
	public NhanVien(String maNhanVien, String hoTenNhanVien, double luongCoBan) {
		maNV = maNhanVien;
		hoTen = hoTenNhanVien;
		this.luongCoBan = luongCoBan;
	}
	
	public double tinhLuong() {
		return luongCoBan;
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}
	
	public void hienThiThongTin() {
		System.out.println("Mã NV: " + maNV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lương cơ bản: " + luongCoBan);
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	
	
}