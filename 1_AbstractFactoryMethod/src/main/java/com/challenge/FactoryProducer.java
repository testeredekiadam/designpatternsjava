package com.challenge;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("Hollywood")) {
			return new HollyMovieFactory();
		} else if(choice.equalsIgnoreCase("Bollywood")) {
			return new BollyMovieFactory();
		}
		
		return null;
	}
}
