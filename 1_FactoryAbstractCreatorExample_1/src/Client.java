
public class Client {
	public static void main(String[] args) {
		
		//Get an object of Circle and call its draw method.
		Shape circle = new CircleFactory().getShape();
		circle.draw();
		
		//Get an object of Rectangle and call its draw method.
		Shape rectangle = new RectangleFactory().factoryMethod();
		rectangle.draw();
		
		//Get an object of Square and call its draw method.
		Shape square = new SquareFactory().getShape();
		square.draw();
	}
}
