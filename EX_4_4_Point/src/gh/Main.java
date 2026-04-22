package gh;

public class Main {

	public static void main(String[] args) {
		Point p1  = new Point();
		System.out.println(p1);
		
		Point p2 = new Point((float)1, (float)1.5);
		System.out.println("\nToạ độ X: " + p2.getX());
		System.out.println("Toạ độ Y: " + p2.getY());
		float[] arr_p2 = p2.getXY();
		System.out.println("Toạ độ X và Y: " + arr_p2[0] + " và " + arr_p2[1]);
		System.out.println(p2);        
		
		MovablePoint mp1 = new MovablePoint();
		System.out.println("\n" + mp1);
		
		MovablePoint mp2 = new MovablePoint((float)2.0, (float)3.2);
		System.out.println("\nToạ độ X speed: " + mp2.getxSpeed());
		System.out.println("Toạ độ Y speed: " + mp2.getySpeed());
		float[] arr_mp2 = mp2.getSpeed();
		System.out.println("Toạ độ X speed và Y speed: " + arr_mp2[0] + " và " + arr_mp2[1]);
		System.out.println(mp2);  
		System.out.println(mp2.move());

		
		MovablePoint mp3 = new MovablePoint((float)2.0, (float)3.2, (float)1.5, (float)2.2);
		System.out.println("\nToạ độ X speed: " + mp3.getxSpeed());
		System.out.println("Toạ độ Y speed: " + mp3.getySpeed());
		float[] arr_mp3 = mp3.getSpeed();
		System.out.println("Toạ độ X speed và Y speed: " + arr_mp3[0] + " và " + arr_mp3[1]);
		System.out.println(mp3);  
		System.out.println(mp3.move());

	}

}
