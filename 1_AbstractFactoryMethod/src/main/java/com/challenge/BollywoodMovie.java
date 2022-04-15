package com.challenge;

interface BollywoodMovie {
	void getMovieName();
}

class BollywoodComedyMovie implements BollywoodMovie {

	@Override
	public void getMovieName() {
		System.out.println("Inside BollywoodComedyMovie::getMovieName() method.");	
	}
}

class BollywoodActionMovie implements BollywoodMovie {

	@Override
	public void getMovieName() {
		System.out.println("Inside BollywoodActionMovie::getMovieName() method.");
	}
	
}