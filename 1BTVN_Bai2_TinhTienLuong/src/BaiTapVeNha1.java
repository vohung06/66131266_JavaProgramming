
public class BaiTapVeNha1 {

	public static void main(String[] args) {
		int gio = 45;
		int luong = 30000;
		double tong;
		if (gio <= 40)
			tong = (double) luong * gio;
		else
			tong = (double) luong * 40 + luong * (gio - 40) * 1.5;
		System.out.println("Luong: " + tong);

	}

}
