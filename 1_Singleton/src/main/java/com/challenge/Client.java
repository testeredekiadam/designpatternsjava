package com.challenge;

public class Client {
	public static void main(String[] args) {
		System.out.println("***Singleton Pattern Demo***");
		System.out.println("");
		System.out.println("");
		System.out.println("Trying to make a captain for our team");
		SingletonChallenge c1 = SingletonChallenge.getInstance();
		System.out.println("");
		System.out.println("");
		System.out.println("Trying to make another Captain for our team");
		SingletonChallenge c2 = SingletonChallenge.getInstance();
		System.out.println("");
		System.out.println("");
		if(c1 == c2) {
			System.out.println("c1 and c2 are the same instance");
		}
		
	
	}
}
