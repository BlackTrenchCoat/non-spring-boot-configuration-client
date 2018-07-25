package org.theproject.springBootConfig;

public class MessagePrinter {
	
	private String message;
	
	public MessagePrinter (String message) {
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println("Hello " + message);
	}
}
