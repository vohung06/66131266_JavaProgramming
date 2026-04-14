
public class TestMain {

	public static void main(String[] args) {
		InvoiceItem inv1 = new InvoiceItem("A101", "But chi do", 888, 1);
	    System.out.println(inv1);
	    
	    inv1.setQty(1000);
	    inv1.setUnitPrice(0.9);
	    System.out.println(inv1);  
	    System.out.println("Ma id: " + inv1.getId());
	    System.out.println("Mo ta: " + inv1.getDesc());
	    System.out.println("So luong: " + inv1.getQty());
	    System.out.println("Gia: " + inv1.getUnitPrice());
	    System.out.println("Tong: " + inv1.getTotal());
	}

}
