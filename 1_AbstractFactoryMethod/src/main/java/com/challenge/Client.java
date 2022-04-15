package com.challenge;

public class Client {
	public static void main(String[] args) {
		//get the hollywood movie factory
		AbstractFactory hMovieFactory = FactoryProducer.getFactory("Hollywood");
		
		//get an action movie on hollywood
		HollywoodMovie hmovie1 = hMovieFactory.getHollywoodMovie("Action");
		//call getName() method on hollywood action movie
		hmovie1.getMovieName();
		
		//get a commedy movie on hollywood
		HollywoodMovie hmovie2 = hMovieFactory.getHollywoodMovie("Comedy");
		//call getName() method on hollywood comedy
		hmovie2.getMovieName();
		
		//get the bollywood movie factory
		AbstractFactory bMovieFactory = FactoryProducer.getFactory("Bollywood");
		
		//get an action movie on bollywood
		BollywoodMovie bmovie1 = bMovieFactory.getBollywoodMovie("Action");
		//call getName() method on bollywood action
		bmovie1.getMovieName();
		
		//get an action movie on bollywood
		BollywoodMovie bmovie2 = bMovieFactory.getBollywoodMovie("Comedy");
		//call getName() method on bollywood action
		bmovie2.getMovieName();
	}
}
