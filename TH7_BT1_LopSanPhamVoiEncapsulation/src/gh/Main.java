package gh;

public class Main {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		System.out.println(sp1);
		
		SanPham sp2 = new SanPham("A010", "pencil", 3000, 15);
		System.out.println(sp2);
		sp2.setGia(4000);
		System.out.println("-> Sau khi thay doi gia: ");
		System.out.println(sp2);
		System.out.println("Tong tien: " + sp2.tinhThanhTien());
	}

}
