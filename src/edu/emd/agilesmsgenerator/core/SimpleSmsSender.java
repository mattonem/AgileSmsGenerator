package edu.emd.agilesmsgenerator.core;

import android.telephony.SmsManager;

public class SimpleSmsSender implements SmsSender {

	public SmsManager getSmsManager() {
		return SmsManager.getDefault();
	}
	
	public boolean send(String phonenumber, String message){
		
		if(phonenumber.length() == 10 && message.length() > 0) {
			getSmsManager().sendTextMessage(phonenumber, null, message, null, null);
			return true;
		}
		return false;
	}
	
}
