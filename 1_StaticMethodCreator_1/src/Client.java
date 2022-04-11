
public class Client {
	public static void main(String[] args) {
		Shape circle = ShapeFactory.getShape("Circle");
		circle.draw();
		
		Shape rectangle = ShapeFactory.getShape("Rectangle");
		rectangle.draw();
		
		Shape square = ShapeFactory.getShape("SQUARE");
		square.draw();
	}

}
