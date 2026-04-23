package thigk2.votrangiahung;

public class SanPham {
	private String maSP;
	private String tenSP;
	private String loaiSP;
	private int giaSP; //thuộc tính thứ 4 do em tự thêm
	
	//hàm tạo 
	public SanPham() {
		
	}
	
	//hàm tạo với đầy đủ tham số
	public SanPham(String maSP, String tenSP, String loaiSP, int giaSP) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.giaSP = giaSP;
	}
	
	//các getter, setter
	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getLoaiSP() {
		return loaiSP;
	}

	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}

	public int getGiaSP() {
		return giaSP;
	}

	public void setGiaSP(int giaSP) {
		this.giaSP = giaSP;
	}

	@Override
	public String toString() {
		return "Mã sản phẩm: " + maSP + ", tên sản phẩm: " + tenSP + ", loại sản phẩm: " + loaiSP + ", giá: " + giaSP;
 	}
	
	
	
	
	
	
	
}
