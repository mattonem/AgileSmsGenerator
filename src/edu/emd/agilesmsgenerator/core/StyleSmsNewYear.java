package edu.emd.agilesmsgenerator.core;

public class StyleSmsNewYear extends StyleSMSDefault {
	
	@Override
	public String generateMessage() {
		return "Bonne annee "+nameOfDestinataire;
	}
}
