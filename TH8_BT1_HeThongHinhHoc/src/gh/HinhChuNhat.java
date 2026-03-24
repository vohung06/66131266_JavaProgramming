package gh;

public class HinhChuNhat extends HinhHoc {
	private double chieuDai;
	private double chieuRong;
	
	public HinhChuNhat(String ten, String mauSac, double chieuDai, double chieuRong) {
		super(ten, mauSac);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	@Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
    
    @Override
    public void hienThiThongTin() {
    	super.hienThiThongTin();
    	System.out.println("Chieu dai va chieu rong la: " + chieuDai + "; " + chieuRong);
    	System.out.println("Dien tich: " + tinhDienTich());
    	System.out.println("Chu vi: " + tinhChuVi());
    }
}
