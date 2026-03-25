package gh;

public class Oto extends PhuongTien {
	private int soCho;
	private String kieuDongCo;
	
	public Oto(String hangSanXuat, int namSanXuat, int giaBan, int soCho, String kieuDongCo) {
		super(hangSanXuat, namSanXuat, giaBan);
		this.soCho = soCho;
		this.kieuDongCo = kieuDongCo;
	}
	
	@Override
    public int layVanTocToiDa() {
        if (kieuDongCo.equals("điện")) 
			return 180;
        else return 200;
    }

    @Override
    public int laySoChoNgoi() {
        return soCho;
    }
    
    public double tinhThueTruocBa() {
        return getGiaBan() * 0.1;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số chỗ: " + soCho);
        System.out.println("Kiểu động cơ: " + kieuDongCo);
        System.out.println("Thuế trước bạ: " + tinhThueTruocBa());
    }

	
	
}
