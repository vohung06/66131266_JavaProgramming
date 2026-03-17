package gh;

public class SanPham {
	private String maSP;
	private String tenSP;
	private int gia;
	private int soLuong;
	
	public SanPham() {
		maSP = "A000";
		tenSP = "Chua co ten SP";
		gia = 1;
		soLuong = 0;
	}
	
	public SanPham(String maSP, String tenSP, int gia, int soLuong) {
		this.setMaSP(maSP);
		this.tenSP = tenSP;
		this.setGia(gia);
		this.setSoLuong(soLuong);
	}
	
	public String getMaSP() {
		return maSP;
	}
	
	public int getGia() {
		return gia;
	}
	
	public int getSoLuong() {
		return soLuong;
	}
	
	public void setGia(int gia) {
		if (gia <= 0)
			System.out.println("Gia khong hop le.");
		else
			this.gia = gia;
	}
	
	public void setSoLuong(int soLuong) {
		if (soLuong < 0)
			System.out.println("So luong khong hop le.");
		else
			this.soLuong = soLuong;
	}
	
	public void setMaSP(String maSP) {
		if (maSP == null)
			System.out.println("Ma SP khong duoc rong");
		else
			this.maSP = maSP;
	}
	
	public int tinhThanhTien() {
		return gia * soLuong;
	}
	
	public String toString() { //hienThiThongTin
		return "Ten SP: " + tenSP + ", ma SP: " + maSP + ", gia: " + gia + ", so luong: " + soLuong;
	}
	
}
