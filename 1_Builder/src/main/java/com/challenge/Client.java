package com.challenge;

public class Client {
	public static void main(String[] args) {
		System.out.println("***Meal Pattern Demo***\n");
		
		Director director = new Director();
		
		MealBuilderInterface vegMeal = new VegMealBuilder();
		System.out.println("VegMeal");
		director.construct(vegMeal);
		Meal m1 = vegMeal.getMeal();
		m1.showItems();
		System.out.println(m1.getCost());
		
		MealBuilderInterface nonVegMeal = new NonVegMealBuilder();
		System.out.println("NonVegMeal");
		director.construct(nonVegMeal);
		Meal m2 = nonVegMeal.getMeal();
		m2.showItems();
		System.out.println(m2.getCost());
		
	}
}
