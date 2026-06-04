package gh06;

import java.util.Scanner;

public class TaiKhoan {
	private String stk;
	private double soDu;
	private KhachHang chuTK;
	
	public TaiKhoan() {
	}

	public TaiKhoan(String stk, double soDu, KhachHang chuTK) {
		super();
		this.stk = stk;
		this.soDu = soDu;
		this.chuTK = chuTK;
	}

	public String getStk() {
		return stk;
	}

	public void setStk(String stk) {
		this.stk = stk;
	}

	public double getSoDu() {
		return soDu;
	}

	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}

	public KhachHang getChuTK() {
		return chuTK;
	}

	public void setChuTK(KhachHang chuTK) {
		this.chuTK = chuTK;
	}
	
	public double napTien() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập số tiền cần nạp: ");
		double tienNap = sc.nextDouble();
		if (tienNap >= 0) {
			soDu += tienNap;
			System.out.println("Bạn vừa nạp " + tienNap + " VND vào tài khoản.");
		}
		else
			System.out.println("Số tiền không hợp lệ!");
		return soDu;
	}
	
	@Override
	public String toString() {
		return "TaiKhoan [stk=" + stk + ", soDu=" + soDu + ", chuTK=" + chuTK + "]";
	}
	
	
	
}
