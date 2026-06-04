package gh06;

import java.util.Scanner;

public class Xe {
	private String dongXe;
	private int soChoNgoi;
	private String ngaySX = "11/6/2019";
	private int giaSan = 400;
	
	public Xe() {
		
	}
	
	public Xe(String dongXe, int soChoNgoi, String ngaySX, int giaSan) {
		this.dongXe = dongXe;
		this.soChoNgoi = soChoNgoi;
		this.ngaySX = ngaySX;
		this.giaSan = giaSan;
	}

	public String getDongXe() {
		return dongXe;
	}

	public void setDongXe(String dongXe) {
		this.dongXe = dongXe;
	}

	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	public String getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(String ngaySX) {
		this.ngaySX = ngaySX;
	}

	public int getGiaSan() {
		return giaSan;
	}

	public void setGiaSan(int giaSan) {
		this.giaSan = giaSan;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("---> NHAP THONG TIN XE: ");
		System.out.println(" - Nhập dòng xe: ");
		String dx = sc.nextLine();
		setDongXe(dx);
		System.out.println(" - Nhập số chỗ ngồi: ");
		int cn = sc.nextInt();
		setSoChoNgoi(cn);
		System.out.println(" - Nhập ngày sản xuất: ");
		String ngay = sc.nextLine();
		setNgaySX(ngay);
		System.out.println(" - Nhập giá sàn: ");
		int gia = sc.nextInt();
		setGiaSan(gia);
	}
	
	public void xuat() {
		
	}
	
}
