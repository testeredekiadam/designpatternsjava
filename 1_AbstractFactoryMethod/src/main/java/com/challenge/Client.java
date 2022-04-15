package com.challenge;

public class Client {
	public static void main(String[] args) {
		//get the movie factory
		AbstractFactory movieFactory = FactoryProducer.getFactory("Hollywood");
		
		//get an action movie on hollywood
		HollywoodMovie hmovie1 = movieFactory.getHollywoodMovie("Action");
		//call getName() method on hollywood action movie
		hmovie1.getMovieName();
		
		//get a commedy movie on hollywood
		HollywoodMovie hmovie2 = movieFactory.getHollywoodMovie("Comedy");
		//call getName() method on hollywood comedy
		hmovie2.getMovieName();
		
		
	}
}
