package gh;

public class XeMay extends PhuongTien{
	private int dungTichXiLanh;
	private String loaiXe;
	
	public XeMay(String hangSanXuat, int namSanXuat, int giaBan, int dungTichXiLanh, String loaiXe) {
		super(hangSanXuat, namSanXuat, giaBan);
		this.dungTichXiLanh = dungTichXiLanh;
		this.loaiXe = loaiXe;
	}
	
	@Override
    public int layVanTocToiDa() {
        if (dungTichXiLanh < 100) 
        	return 80;
        else if (dungTichXiLanh <= 150) 
        	return 100;
        else 
        	return 120;
    }
	
	@Override
    public int laySoChoNgoi() {
        return 2;
    }
	
	@Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Dung tích xi lanh: " + dungTichXiLanh);
        System.out.println("Loại xe: " + loaiXe);
    }
	
	
}
