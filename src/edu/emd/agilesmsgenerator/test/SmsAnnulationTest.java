package edu.emd.agilesmsgenerator.test;

import java.util.Date;

import org.junit.Test;

import junit.framework.TestCase;

//import org.junit.Test;

import edu.emd.agilesmsgenerator.core.Sms;

public class SmsAnnulationTest extends TestCase{
	
	private Sms sms;

	@Override
	protected void setUp() throws Exception {
		sms = new Sms();
		sms.schedule(new Date(2014,1,1));
		super.setUp();
	}

	@Test
	public void test() {
		assertTrue(sms.isScheduled());
		sms.annulation();
		assertFalse(sms.isScheduled());
	}

}
