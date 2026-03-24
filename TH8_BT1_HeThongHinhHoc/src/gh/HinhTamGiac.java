package gh;

public class HinhTamGiac extends HinhHoc{
	private double a;
	private double b;
	private double c;
	
	public HinhTamGiac(String ten, String mauSac, double a, double b, double c) {
		super(ten, mauSac);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	@Override
    public double tinhDienTich() {
		double P = (a + b + c)/2;
        return Math.sqrt(P * (P - a) * (P - b) * (P - c));
    }

    @Override
    public double tinhChuVi() {
        return a + b + c;
    }
    
    @Override
    public void hienThiThongTin() {
    	super.hienThiThongTin();
    	System.out.println("Cac canh la: " + a + "; " + b + "; " + c);
    	System.out.println("Dien tich: " + tinhDienTich());
    	System.out.println("Chu vi: " + tinhChuVi());
    }
    public boolean kiemTraHopLe() {
    	return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
