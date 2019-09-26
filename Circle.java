package lab10;

public class Circle{
	public double radius;
	public double area;
	public int x;
	public double[] temp;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getRadius() {
		return this.radius;
	}

	public String toString() {
		return "Circle with radius: " + this.radius + ", area: " + getArea();
	}
	
	
	
	
}
