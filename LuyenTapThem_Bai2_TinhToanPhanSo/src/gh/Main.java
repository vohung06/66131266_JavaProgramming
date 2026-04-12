package gh;

public class Main {

	public static void main(String[] args) {
		PhanSo ps1 = new PhanSo(2, 4);
		System.out.println(ps1);
		System.out.println(ps1.getGiaTriPhanSo());
		ps1.rutGon();
		System.out.println(ps1);
		
		PhanSo ps2 = new PhanSo(1, 2);
		System.out.println(ps1.cong2PS(ps2));
		
	}

}
