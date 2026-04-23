package thigk2.votrangiahung;

public class Main {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham("A001", "Bút chì", "Thường", 5000);
		SanPham sp2 = new SanPham("A002", "Bút bi", "Thường", 8000);
		SanPham sp3 = new SanPham("A003", "Bút bi Arono", "Cao cấp", 22000);
		
		System.out.println("Sản phẩm 1: " + sp1.toString());
		System.out.println("Sản phẩm 2: " + sp2.toString());
		System.out.println("Sản phẩm 3: " + sp3.toString());
		
		System.out.println("Nhập thông tin sản phẩm thứ 4: ");
	}

}
