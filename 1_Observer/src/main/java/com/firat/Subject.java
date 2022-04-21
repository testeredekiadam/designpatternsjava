package com.firat;

import java.util.ArrayList;
import java.util.List;

interface Subject {

	//methods to register and unregister observer
	public void register(Observer obj);
	public void unregister(Observer obj);
	
	//method to notify observers of changes
	public void notifyObservers();
	
	//method to get updates from subject, not required,
	//but added so observers can query 
	public Object getUpdate(Observer obj);
}


//class
class MyTopic implements Subject {
	
	private List<Observer> observers;
	private String message;
	private boolean changed;
	
	public MyTopic() {
		this.observers = new ArrayList<Observer>();
	}

	public void register(Observer obj) {
		if(obj == null) {
			throw new NullPointerException("Null Observer");
		} 
		if(!observers.contains(obj)) {
			observers.add(obj);
		} 
	}

	public void unregister(Observer obj) {
		observers.remove(obj);
	}

	public void notifyObservers() {
		List<Observer> observersLocal = null;
		
		if(!changed) {
			return;
		}
		
		observersLocal = new ArrayList<Observer>(this.observers);
		this.changed = false;
		
		for(Observer obj : observersLocal) {
			obj.update();
		}
	}

	public Object getUpdate(Observer obj) {
		return this.message;
	}
	
	//method to post message to the topic, change state (trigger notification)
	public void postMessage(String msg) {
		System.out.println("Message Posted to Topic: " + msg);
		this.message=msg;
		this.changed=true;
		notifyObservers();
	}
}