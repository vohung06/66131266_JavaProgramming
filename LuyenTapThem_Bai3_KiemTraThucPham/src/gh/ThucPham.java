package gh;

public class ThucPham {
	private String maHang = "0000";
	private String tenHang = "Chưa có sản phẩm";
	private int donGia;
	private String ngaySanXuat = "00/00/0000";
	private String ngayHetHan = "00/00/0000";
	
	public ThucPham(String maHang) {
		this.maHang = maHang;
	}
	
	public ThucPham(String maHang, String tenHang, int donGia, String ngaySanXuat, String ngayHetHan) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		if (donGia > 0)
			this.donGia = donGia;
		else	
			this.donGia = 0;
	}

	public String getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(String ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public String getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(String ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	
	
}
