package gh;

public class HocSinh {
	private String tenHS;
	private short tuoiHS;
	private String lopHS;
	
	public HocSinh() {
		
	}
	public HocSinh(String tenHS, short tuoiHS, String lopHS) {
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}

	public String getTenHS() {
		return tenHS;
	}

	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}

	public short getTuoiHS() {
		return tuoiHS;
	}

	public void setTuoiHS(short tuoiHS) {
		this.tuoiHS = tuoiHS;
	}

	public String getLopHS() {
		return lopHS;
	}

	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}
	@Override
	public String toString() {
//		return "HocSinh [tenHS=" + tenHS + ", tuoiHS=" + tuoiHS + ", lopHS=" + lopHS + "]";
		return "Họ và tên: " + tenHS + "\nTuổi: " + tuoiHS + "\nLớp: " + lopHS + "\n";
	}
	
}
