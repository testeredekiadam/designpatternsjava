
public class Client {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//get an object of Circle and call its draw method
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		//get an object of Rectangle and call its draw method
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		
		//get an object of Square and call its draw method
		Shape square = shapeFactory.getShape("Square");
		square.draw();
		
	}
}
