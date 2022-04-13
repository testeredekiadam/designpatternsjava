package com.firat;

public abstract class AbstractFactory {
	abstract Shape getShape(String shape);
	abstract Color getColor(String color);
}

class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String type) {
		if(type == null) {
			return null;
		}
		if(type.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if(type.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if(type.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		
		
		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}
	
}

class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		return null;
	}

	@Override
	Color getColor(String color) {
		
		if(color == null) {
			return null;
		}
		if(color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if(color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if(color.equalsIgnoreCase("Blue")) {
			return new Blue();
		}
		
		return null;
	}
	
}