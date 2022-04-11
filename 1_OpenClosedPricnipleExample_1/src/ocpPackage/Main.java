package ocpPackage;

public class Main {
	
	public static void main(String[] args) {
		Shape rect = new Rectangle(5, 4);
		Shape circ = new Circle(5);
		
		System.out.println(new AreaCalculator().calculateShapeArea(rect));
		System.out.println();
		System.out.println(new AreaCalculator().calculateShapeArea(circ));
	}
}
