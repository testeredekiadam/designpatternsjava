package com.challenge;

interface Item {
	public String name();
	public float price();
	public Packing packing();
}

abstract class Burger implements Item {

	public Packing packing() {
		return new Wrapper();
	}
	
	
	public abstract float price();
	
}

class VegBurger extends Burger {

	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}
	
}

class ChickenBurger extends Burger {

	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 42.0f;
	}
	
}


abstract class ColdDrink implements Item {

	public Packing packing() {
		return new Bottle();
	}

	public abstract float price();
	
}

class Coke extends ColdDrink {

	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 2.5f;
	}
	
}

class Pepsi extends ColdDrink {

	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 2.3f;
	}
}

interface Packing {
	public String pack();
}

class Wrapper implements Packing{
	public String pack() {
		return "Wrapper";
	}
}

class Bottle implements Packing {

	public String pack() {
		return "Bottle";
	}
	
}