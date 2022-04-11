package ocpPackage;

class Circle implements Shape {
	private double radius;
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double calculateArea() {
		return (22/7) * radius * radius;
	}
}