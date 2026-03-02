
public class BaiTap4 {

	public static void main(String[] args) {
		int soDien = 250;
		double tienDien = 0;
		if (soDien <= 50)
			tienDien = soDien * 1678;
	    else if (soDien <= 100)
	    	tienDien = 50 * 1678 + (soDien - 50) * 1734;
	    else if (soDien <= 200) 
	        tienDien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
	    else if (soDien <= 300)
	        tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
	    else 
	        tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
		System.out.println("So dien: " + soDien + "kWh");
		System.out.println("Tien dien: " + tienDien + " dong");
	}

}
