package gh;

public class Main {

	public static void main(String[] args) {
		Point p1  = new Point();
		System.out.println(p1);
		
		Point p2 = new Point((float)1, (float)1.5);
		System.out.println("\nToạ độ X: " + p2.getX());
		System.out.println("Toạ độ Y: " + p2.getY());
		float[] arr_p2 = p2.getXY();
		System.out.println("Toạ độ X và Y: " + arr_p2[0] + arr_p2[1]);
		System.out.println()
	}

}
