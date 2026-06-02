package gh06;

public class Book {
	private String maSach;
	private String tenSach;
	private String theLoai;
	private boolean tinhTrang; //true là còn hàng, false là hết hàng
	private String ghiChu;
	
	public Book() {
		
	}
	
	public Book(String maSach, String tenSach, String theLoai, boolean tinhTrang, String ghiChu) {
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.theLoai = theLoai;
		this.tinhTrang = tinhTrang;
		this.ghiChu = ghiChu;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	
	
	
	
}
