package gh06;

import java.time.LocalDate;
import java.util.Scanner;

public class XeVinfast extends Xe implements Phi {
	private String noiDK;

	public XeVinfast(String noiDK) {
		this.noiDK = noiDK;
	}

	public XeVinfast() {
	}

	public XeVinfast(String dongXe, int soChoNgoi, LocalDate ngaySX, int giaSan, String noiDK) {
		super(dongXe, soChoNgoi, ngaySX, giaSan);
		this.noiDK = noiDK;
	}

	public String getNoiDK() {
		return noiDK;
	}

	public void setNoiDK(String noiDK) {
		this.noiDK = noiDK;
	}
	
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print(" - Nhập nơi đăng ký: ");
		String noi = sc.nextLine();
		setNoiDK(noi);
	}
	
	
	public void xuat() {
		super.xuat();
		System.out.println(" - Nơi đăng ký: " + noiDK);
	}
	
	public double tinhPhiTruocBa() {
		return PHI_TRUOC_BA * tinhGiaBan();
	}
	
	public double tinhPhiDK() {
		if (noiDK.equals("Hà nội"))
			return 0.12;
		else
			return 0.1;
	}
	
	public double tinhGiaLanBanh() {
		return tinhGiaBan() + tinhPhiTruocBa() + tinhPhiDK();
	}
	
	
}
