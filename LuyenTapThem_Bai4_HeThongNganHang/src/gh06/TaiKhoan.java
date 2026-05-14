package gh06;

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
	
	
	
	
	
}
