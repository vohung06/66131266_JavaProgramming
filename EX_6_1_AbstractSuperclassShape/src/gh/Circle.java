package gh;

public class Circle extends Shape{
	private double radius;

	public Circle() {
		
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, Boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override 
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle[" + super.toString() + "radius=" + radius + "]";
	}
	
	
}
