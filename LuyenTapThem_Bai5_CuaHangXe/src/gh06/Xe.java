package gh06;

import java.time.LocalDate;
import java.util.Scanner;

public class Xe {
	private String dongXe;
	private int soChoNgoi;
	private LocalDate ngaySX = LocalDate.of(2019, 6, 11);
	private int giaSan = 400;
	
	public Xe() {
		
	}
	
	public Xe(String dongXe, int soChoNgoi) {
		this.dongXe = dongXe;
		this.soChoNgoi = soChoNgoi;
	}
	
	public Xe(String dongXe, int soChoNgoi, LocalDate ngaySX, int giaSan) {
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

	public LocalDate getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(LocalDate ngay) {
		this.ngaySX = ngay;
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
		System.out.print(" - Nhập dòng xe: ");
		String dx = sc.nextLine();
		setDongXe(dx);
		System.out.print(" - Nhập số chỗ ngồi: ");
		int cn = sc.nextInt();
		setSoChoNgoi(cn);
		sc.nextLine();
		System.out.print(" - Nhập ngày sản xuất (yyyy-mm-dd): ");
		String ngay = sc.nextLine();
		setNgaySX(LocalDate.parse(ngay));
		System.out.print(" - Nhập giá sàn: ");
		int gia = sc.nextInt();
		setGiaSan(gia);
	}
	
	public void xuat() {
		System.out.println("---> THONG TIN CUA XE: ");
		System.out.println(" - Dòng xe: " + dongXe);
		System.out.println(" - Số chỗ ngồi: " + soChoNgoi);
		System.out.println(" - Ngày sản xuất: " + ngaySX);
		System.out.println(" - Giá sàn: " + giaSan);
	}
	
	public double tinhGiaBan() {
		//Period.between(ngaySX, LocalDate.now()).getYears() -> lấy số năm
		if (ngaySX.plusYears(2).isBefore(LocalDate.now())) {
			return (double)giaSan * 1.15;
		}
		else if (ngaySX.plusYears(1).isBefore(LocalDate.now()) || ngaySX.plusYears(1).isEqual(LocalDate.now())) {
			return (double)giaSan * 1.3;
		}
		else
			return (double)giaSan * 1.5;
	}
}
