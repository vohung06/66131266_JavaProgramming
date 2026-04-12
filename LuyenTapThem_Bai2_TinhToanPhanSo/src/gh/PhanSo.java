package gh;

public class PhanSo {
	private int tu;
	private int mau;
	
	public PhanSo() {
		
	}
	
	public PhanSo(int tu, int mau) {
		this.tu = tu;
		if (mau == 0) {
	        System.out.println("Mẫu số không hợp lệ! Tự động gán mẫu số bằng 1");
	        this.mau = 1;
	    } 
		else
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
		if (mau == 0) {
	        System.out.println("Mẫu số không hợp lệ!");
	        return;
	    } 
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
		if (mau < 0) {
	        tu = -tu;
	        mau = -mau;
	    }
	}
	
	//Hàm cộng 2 phân số
	public PhanSo cong2PS(PhanSo ps2) {
		int tuMoi = this.tu * ps2.mau + ps2.tu * this.mau;
		int mauMoi = this.mau * ps2.mau;
		PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
		ketQua.rutGon();
		return ketQua;
	}
	
	//Hàm trừ 2 phân số
	public PhanSo tru2PS(PhanSo ps2) {
		int tuMoi = this.tu * ps2.mau - ps2.tu * this.mau;
		int mauMoi = this.mau * ps2.mau;
		PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
		ketQua.rutGon();
		return ketQua;
	}
	
	//Hàm nhân 2 phân số
	public PhanSo nhan2PS(PhanSo ps2) {
		int tuMoi = this.tu * ps2.tu;
		int mauMoi = this.mau * ps2.mau;
		PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
		ketQua.rutGon();
		return ketQua;
	}
	
	//Hàm chia 2 phân số
	public PhanSo chia2PS(PhanSo ps2) {
		if (ps2.tu == 0) {
			System.out.println("Không thể chia");
	        return null;
	    }
		int tuMoi = this.tu * ps2.mau;
		int mauMoi = this.mau * ps2.tu;
		PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
		ketQua.rutGon();
		return ketQua;
	}
	
	
}
