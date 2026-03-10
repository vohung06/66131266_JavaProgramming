
public class Rentangle {
	private float length;
	private float width;
	
	public Rentangle() {
		length = 1.0f;
		width = 1.0f;
	}
	public Rentangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	public float getLength() {
		return length;
	}
	public float getWidth() {
		return width;
	}
	public void setLength(float l) {
		length = l;
	}
	public void setWidth(float w) {
		width = w;
	}
	public double getArea() {
		return length * width;
	}
	public double getPerimeter() {
		return (length + width) * 2;
	}
	public String toString() {
		return "Rectangle [length = " + length + ", width =" + width + "]";
		
	}
	
}
