package com.firat;

public class Client {
	public static void main(String[] args) {
		//get the shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		//get an object of shape circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		//call draw method of shape circle
		shape1.draw();
		
		//get an object of shape rectangle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		//call draw method on rectangle
		shape2.draw();
		
		//get an object of shape square
		Shape shape3 = shapeFactory.getShape("SQUARE");
		//call draw method on rectangle
		shape3.draw();
		
		//get the color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		//get an object of color red
		Color color1 = colorFactory.getColor("RED");
		//call fill method on red
		color1.fill();
		
		//get an object of color green
		Color color2 = colorFactory.getColor("GREEN");
		//call fill method on green
		color2.fill();
		
		//get an object of color blue
		Color color3 = colorFactory.getColor("BLUE");
		//call fill method on blue
		color3.fill();
	}
}
