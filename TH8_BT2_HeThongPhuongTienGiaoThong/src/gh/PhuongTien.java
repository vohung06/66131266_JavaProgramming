package gh;

public class PhuongTien {
	private String hangSanXuat;
	private int namSanXuat;
	private int giaBan;
	
	public PhuongTien() {
		
	}
	public PhuongTien(String hangSanXuat, int namSanXuat, int giaBan) {
		this.hangSanXuat = hangSanXuat;
		this.namSanXuat = namSanXuat;
		this.giaBan = giaBan;
	}
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public int getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}
	
	public int layVanTocToiDa() {
		return 0;
	}
	
	public int laySoChoNgoi() {
		return 0;
	}
	
	public void hienThiThongTin() {
        System.out.println("Hãng sản xuất: " + hangSanXuat);
        System.out.println("Năm sản xuất: " + namSanXuat);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Vận tốc tối đa: " + layVanTocToiDa());
        System.out.println("Số chỗ ngồi: " + laySoChoNgoi());
    }
}
