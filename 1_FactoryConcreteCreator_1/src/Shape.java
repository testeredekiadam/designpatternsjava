
interface Shape {
	public void draw();
}


class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
		
	}
	
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
		
	}
	
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
		
	}
	
}