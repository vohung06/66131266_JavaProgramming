
public class Main {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien();
		sv1.ten = "Vo Tran Gia Hung";
		sv1.tuoi = 20;
		sv1.mssv = "66131266";
		
		SinhVien sv2 = new SinhVien();
		sv2.ten = "Nguyen Hihi";
		sv2.tuoi = 10;
		sv2.mssv = "76189000";
		
		sv1.hocBai("Lap trinh Java");
		sv2.hocBai("Toan tieu hoc");

	}

}
