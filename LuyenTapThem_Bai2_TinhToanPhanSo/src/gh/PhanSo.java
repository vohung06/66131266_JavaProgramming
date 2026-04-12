package gh;

public class PhanSo {
	private int tu;
	private int mau;
	
	public PhanSo() {
		
	}
	
	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}

	public int getTu() {
		return tu;
	}

	public void setTu(int tu) {
		this.tu = tu;
	}

	public int getMau() {
		return mau;
	}

	public void setMau(int mau) {
		this.mau = mau;
	}
	
	//Hàm lấy giá trị phân số
	public float getGiaTriPhanSo() {
		return (float) tu/mau;
	}

	@Override
	public String toString() {
		if (tu == 0)
			return "0";
		if (mau == 1)
			return String.valueOf(tu);
		return tu + "/" + mau;
	}
	
	//Hàm tìm UCLN của tử và mẫu
	public int UCLN(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return Math.abs(a);
	}
	
	//Hàm rút gọn phân số
	public void rutGon() {
		int temp = UCLN(tu, mau);
		tu /= temp;
		mau /= temp;
	}
	
	//Hàm cộng 2 phân số
	public PhanSo cong2PS(PhanSo ps2) {
		int tuMoi = this.tu * ps2.mau + ps2.tu * this.mau;
		int mauMoi = this.mau * ps2.mau;
		PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
		ketQua.rutGon();
		return ketQua;
	}
	
	
}
