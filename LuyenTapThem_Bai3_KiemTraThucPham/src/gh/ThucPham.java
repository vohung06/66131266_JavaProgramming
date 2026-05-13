package gh;

import java.time.LocalDate;

public class ThucPham {
	private String maHang = "";
	private String tenHang = "Chưa có sản phẩm";
	private int donGia = 0;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	
	public ThucPham(String maHang) {
		this.maHang = maHang;
	}
	
	public ThucPham(String maHang, String tenHang, int donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		setMaHang(maHang);
		this.tenHang = tenHang;
		setDonGia(donGia);
		this.ngaySanXuat = ngaySanXuat;
		setNgayHetHan(ngayHetHan);
	}
	
	public String getMaHang() {
		return maHang;
	}
	
	public void setMaHang(String maHang) {
	    if (maHang != null && !maHang.trim().isEmpty())
	        this.maHang = maHang;
	    else
	    	this.maHang = "0000";
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
			this.donGia = 0; //gán giá trị mặc định cho donGia
	}
	
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
	    if (ngayHetHan.isAfter(ngaySanXuat))
	        this.ngayHetHan = ngayHetHan;
	    else
	        this.ngayHetHan = null;
	}
	
	
}
