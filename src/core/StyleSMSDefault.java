package core;


public class StyleSMSDefault implements StyleSMS {
	String nameOfDestinataire="";
	
	public String getNameOfDestinataire() {
		return nameOfDestinataire;
	}


	public void setNameOfDestinataire(String nameOfDestinataire) {
		this.nameOfDestinataire = " "+nameOfDestinataire;
	}


	@Override
	public String generateMessage() {
		// TODO Auto-generated method stub
		return "HelloWorld"+nameOfDestinataire;
	}


	@Override
	public void changeParameter(String aNameOfDestinataire) {
		if(nameOfDestinataire==""){
			setNameOfDestinataire(aNameOfDestinataire);
		}
		else {
			setNameOfDestinataire("");
		}
		
	}

}
