package com.challenge;

import java.util.ArrayList;
import java.util.Iterator;

public interface Subject {

	public void registerObserver(Observer o);
	public void unregisterObserver(Observer o);
	public void notifyObservers();
}

class CricketData implements Subject {
	
	int runs;
	int wickets;
	float overs;
	
	ArrayList<Observer> observerList;
	
	public CricketData() {
		observerList = new ArrayList<Observer>();
	}
	
	
	//if not contains -> add
	public void registerObserver(Observer observer) {
		if(observer == null) {
			throw new NullPointerException();
		}
		if(!observerList.contains(observer)) {
			observerList.add(observer);
		}
	
	}
	
	//delete
	public void unregisterObserver(Observer observer) {
		observerList.remove(observerList.indexOf(observer));
	}

	//send message to all observers in observerList
	public void notifyObservers() {
		for(Iterator<Observer> it = observerList.iterator(); it.hasNext();) {
			Observer o = it.next();
			o.update(runs, wickets, overs);
		}
	}
	
	//get latest runs from stadium
	private int getLatestRuns() {
		return 90;
	}
	
	//get latest wickets from stadium
	private int getLatestWickets() {
		return 2;
	}
	
	//get latest overs from stadium
	private float getLatestOvers() {
		return (float)10.2;
	}
	
	public void dataChanged() {
		//get latest data
		runs = getLatestRuns();
		wickets = getLatestWickets();
		overs = getLatestOvers();
		
		notifyObservers();
	}
}
