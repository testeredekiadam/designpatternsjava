package com.challenge;

public class SingletonChallenge {
	
	private SingletonChallenge() {}
	private static String captainName = "";
	//Bill Pugh
	private static class BillPughHelper{
		private static final SingletonChallenge captain = new SingletonChallenge(); 
	}
	
	public static SingletonChallenge getInstance() {
		if(BillPughHelper.captain == null) {
			System.out.println("New Captain selected for our team.");
			
		} else {
			System.out.println("You already have a Captain for your team. Send him for the toss.");
		}
		
		return BillPughHelper.captain;
	}
	
	public void setCoach(String name) {
		captainName = name;
	}
	
	public String getCaptain() {
		return captainName;
	}
	
}
