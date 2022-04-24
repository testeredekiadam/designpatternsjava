package com.challenge;

interface MealBuilderInterface {
	void buildBurger();
	void buildDrink();
	Meal getMeal();
}

class VegMealBuilder implements MealBuilderInterface {
	
	private Meal vegMeal = new Meal();
	public void buildBurger() {
		vegMeal.addItem(new VegBurger());
		
	}

	public void buildDrink() {
		vegMeal.addItem(new Coke());
		
	}

	public Meal getMeal() {
		return vegMeal;
	}
	
}

class NonVegMealBuilder implements MealBuilderInterface {
	
	private Meal nonVegMeal = new Meal();

	public void buildBurger() {
		nonVegMeal.addItem(new ChickenBurger());
	}

	public void buildDrink() {
		nonVegMeal.addItem(new Pepsi());
		
	}

	public Meal getMeal() {
		return nonVegMeal;
	}
	
	
}