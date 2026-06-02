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
	
	
	
}
