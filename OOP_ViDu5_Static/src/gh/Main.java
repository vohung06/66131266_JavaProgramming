package gh;

public class Main {

	public static void main(String[] args) {
		System.out.println(SinhVienNTU.TEN_TRUONG);
		SinhVienNTU.sayHi();
		
		SinhVienNTU sv1 = new SinhVienNTU("Võ Trần Gia Hưng", "66.CNTT-3");
		SinhVienNTU sv2 = new SinhVienNTU("Nguyễn Việt Hoàng", "66.KHMT");
		
		sv1.sayHello();
		sv2.sayHello();

	}

}
