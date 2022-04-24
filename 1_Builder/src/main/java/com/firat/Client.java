package com.firat;

public class Client {
	public static void main(String[] args) {
		System.out.println("***Builder Pattern Demo***\n");
		
		Director director = new Director();
		
		BuilderInterface carBuilder =  new Car();

		director.construct(carBuilder);
		Product p1 = carBuilder.getVehicle();
		p1.show();
		
		////------------------------////
		BuilderInterface motorcycleBuilder = new Motorcycle();

		director.construct(motorcycleBuilder);
		Product p2 = motorcycleBuilder.getVehicle();
		p2.show();
	}
}
