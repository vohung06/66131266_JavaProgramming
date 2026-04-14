
public class InvoiceItem {
	private String id;
	private String desc;
	private int qty;
	private double unit_price;
	
	public InvoiceItem(String id, String desc, int qty, double unit_price) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unit_price = unit_price;
	}
	
	public String getId() {
		return id;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public double getUnitPrice() {
		return unit_price;
	}
	
	public void setUnitPrice(double unit_price) {
		this.unit_price = unit_price;
	}
	
	public double getTotal() {
		return qty * unit_price;
	}
	
	public String toString() {
		return "InvoiceItem [id = " + id + ", desc = " + desc + ", qty = " + qty + ", unitPrice = " + unit_price + "]";
	}
}
