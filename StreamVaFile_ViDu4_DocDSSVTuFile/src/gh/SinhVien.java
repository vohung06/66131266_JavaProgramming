package gh;

public class SinhVien {
	private int soThuTu;
	private String hoTen;
	private int namSinh;
	private String gioiTinh;
	
	public SinhVien() {
		
	}
	
	public SinhVien(int soThuTu, String hoTen, int namSinh, String gioiTinh) {
		this.soThuTu = soThuTu;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}

	@Override
	public String toString() {//String format: phương thức tạo định dạng, căn chỉnh độ rộng, dài chuỗi
	    return String.format("%-5d %-20s %-10d %-10s", soThuTu, hoTen, namSinh, gioiTinh);
	}
	
	
}
