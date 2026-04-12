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
		return "Phân số: " + tu + "/" + mau;
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
	
	public void rutGon() {
		int temp = UCLN(tu, mau);
		tu /= temp;
		mau /= temp;
	}
	
	
}
