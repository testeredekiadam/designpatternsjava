package com.firat;

interface Observer {
	// method to update the observer, used by subject
	public void update();
	
	//attach with subject to observer, not required, but added so that
	//the observer can query the subject to see if an update has occured
	public void setSubject(Subject sub);
}


class MyTopicSubscriber implements Observer {
	private String name;
	
	private Subject topic;

	public MyTopicSubscriber(String nm) {
		this.name = nm;
	}
	
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null) {
			System.out.println(name+":: No new message");
		} else {
			System.out.println(name+":: Consuming message::" + msg);
		}
		
	}

	public void setSubject(Subject sub) {
		// not required, added so observer can ask subject for state
		this.topic=sub;
	}
}