package edu.emd.agilesmsgenerator.core;

import java.util.Date;

public class Sms {

	public Date schedule;

	public void schedule(Date date) {
		schedule = date;
	}

	public void annulation() {
		this.schedule = null;
	}

	public boolean isScheduled() {
		return schedule == null;
	}

}
