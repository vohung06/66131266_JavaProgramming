
public class Main {

	public static void main(String[] args) {
		ChuNhat cn1 = new ChuNhat(); //cn1 co dai = 10 va rong = 5
		ChuNhat cn2 = new ChuNhat(20, 15); //cn2 co dai = 20 va rong = 15
		ChuNhat hv = new ChuNhat(15, 15);
		//In chieu dai va chieu rong CN1 
		double cn1_dai = cn1.getDai();
		double cn1_rong = cn1.getRong();
		System.out.println("Hinh CN1 co chieu dai la " + cn1_dai + " va chieu rong la " + cn1_rong);
		//Thay doi chieu dai cua CN1
		cn1.setDai(50);
		cn1_dai = cn1.getDai();
		cn1_rong = cn1.getRong();
		System.out.println("-> Sau khi thay doi chieu dai: ");
		System.out.println("Hinh CN1 co chieu dai moi la " + cn1_dai + " va chieu rong la " + cn1_rong);
		
	}

}
