package com.firat;

interface BuilderInterface {
	void buildBody();
	void insertWheels();
	void addHeadlights();
	Product getVehicle();
	
}


class Car implements BuilderInterface {
	private Product product = new Product();

	public void buildBody() {
		product.add("This is a body of a car");
		
	}

	public void insertWheels() {
		product.add("4 wheels are added");
		
	}

	public void addHeadlights() {
		product.add("2 headlights are added");
		
	}
	
	public Product getVehicle() {
		return product;
	}
}

class Motorcycle implements BuilderInterface {
	private Product product = new Product();

	public void buildBody() {
		product.add("This is a body of a Motorcycle");
		
	}

	public void insertWheels() {
		product.add("2 wheels are added");
		
	}

	public void addHeadlights() {
		product.add("1 headlights are added");
		
	}
	
	public Product getVehicle() {
		return product;
	}
}

