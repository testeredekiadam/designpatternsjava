package com.challenge;

public abstract class AbstractFactory {
	abstract HollywoodMovie getHollywoodMovie(String name);
	abstract BollywoodMovie getBollywoodMovie(String name);
}

class HollyMovieFactory extends AbstractFactory {

	@Override
	HollywoodMovie getHollywoodMovie(String name) {
		
		if(name == null) {
			return null;
		}
		
		if(name.equalsIgnoreCase("COMEDY")) {
			return new HollywoodComedyMovie();
		} else if(name.equalsIgnoreCase("ACTION")) {
			return new HollywoodActionMovie();
		}
		
		return null;
	}

	@Override
	BollywoodMovie getBollywoodMovie(String name) {
		return null;
	}
	
	
}


class BollyMovieFactory extends AbstractFactory{

	@Override
	HollywoodMovie getHollywoodMovie(String name) {
		return null;
	}

	@Override
	BollywoodMovie getBollywoodMovie(String name) {
		if(name == null) {
			return null;
		}
		if(name.equalsIgnoreCase("COMEDY")) {
			return new BollywoodComedyMovie();
		}else if(name.equalsIgnoreCase("ACTION")) {
			return new BollywoodActionMovie();
		}
		return null;
	}
}

