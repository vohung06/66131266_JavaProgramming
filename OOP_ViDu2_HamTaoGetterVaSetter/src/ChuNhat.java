
public class ChuNhat {
	private double dai;
	private double rong;
	//Ham tao Constructor
	public ChuNhat() {
		dai = 10;
		rong = 5;
	}
	public ChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}
	//Cac getter
	double getDai() {
		return dai;
	}
	double getRong() {
		return rong;
	}
	//Cac setter
	void setDai(double dai) {
		this.dai = dai;
	}
	void setRong(double rong) {
		this.rong = rong;
	}
	//Cac phuong thuc khac
	//Tom tat thong tin cua doi tuong thanh mot chuoi de in ra man hinh
	public String toString() {
		String s = "Hinh co chieu dai la " + dai + " va chieu rong la " + rong;
		return s;
	}
}
