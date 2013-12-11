package edu.emd.agilesmsgenerator.core;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Repetition {

	public String getDateActuel() {
	
		//SimpleDateFormat dateActuel = new SimpleDateFormat("dd-mm-yy");
		Date now = new Date();
		DateFormat date = new SimpleDateFormat("dd-mm-yy");
		String strDate = date.format(now);
		return strDate;
	}

}
