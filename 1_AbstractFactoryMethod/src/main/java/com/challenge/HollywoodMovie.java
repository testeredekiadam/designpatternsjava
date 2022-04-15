package com.challenge;

interface HollywoodMovie {
	void getMovieName();
}

class HollywoodComedyMovie implements HollywoodMovie {

	@Override
	public void getMovieName() {
		System.out.println("Inside HollywoodComedyMovie::getMovieName() method.");
		
	}
	
}

class HollywoodActionMovie implements HollywoodMovie {

	@Override
	public void getMovieName() {
		System.out.println("Inside HollywoodActionMovie::getMovieName() method.");
	}
	
}
