package com.innovator.learnit.javacore.Enumeration;


public enum MessageType {
	
	A(Priority.HIGH), B(Priority.MEDIUM), C(Priority.LOW), D(Priority.LOW);

	private Priority messagePriority;
	
	private MessageType (Priority messageType){
		this.messagePriority = messageType;
	}
	
	public Priority getPriority() {
		return this.messagePriority;
	}
}
