package edu.emd.agilesmsgenerator.core;


public class StyleSMSDefault implements StyleSMS {
	String nameOfDestinataire="";
	
	public String getNameOfDestinataire() {
		return nameOfDestinataire;
	}


	public void setNameOfDestinataire(String nameOfDestinataire) {
		this.nameOfDestinataire = nameOfDestinataire;
	}


	@Override
	public String generateMessage() {

		return "HelloWorld "+nameOfDestinataire;
	}


	@Override
	public void changeParameter(String aNameOfDestinataire) {
		if(nameOfDestinataire.equals("")){
			setNameOfDestinataire(aNameOfDestinataire);
		}
		else {
			setNameOfDestinataire("");
		}
		
	}

}
