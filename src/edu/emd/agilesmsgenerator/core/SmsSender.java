package edu.emd.agilesmsgenerator.core;

public interface SmsSender {
	
	public boolean send(String phonenumber, String message);

}
