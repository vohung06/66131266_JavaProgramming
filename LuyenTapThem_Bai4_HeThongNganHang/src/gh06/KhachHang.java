package gh06;

public class KhachHang {
	String maKH;
	String hoTen;
	String sdt;
	String diaChi;
	
	public KhachHang() {
		
	}

	public KhachHang(String maKH, String hoTen, String sdt, String diaChi) {
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.sdt = sdt;
		this.diaChi = diaChi;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "KhachHang:" + 
				"\n - MaKH: " + maKH + 
				"\n - Họ tên: " + hoTen + 
				"\n - Số điện thoại: " + sdt + 
				"\n - Địa chỉ: " + diaChi;
	}
	
	
	
	
	
	
}
