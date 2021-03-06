package edu.emd.agilesmsgenerator.test;

import junit.framework.TestCase;

import org.junit.Test;

import edu.emd.agilesmsgenerator.core.SimpleSmsSender;
import edu.emd.agilesmsgenerator.core.SmsSender;

public class TestSmsSender extends TestCase {
	
	private SmsSender smssender;

	public void setUp() {
		smssender = new SimpleSmsSender();
	}
	
	@Test
	public void test_should_send_message() {
		String message = "blabla";
		boolean result = smssender.send("0673936589", message);
		assertTrue(result);
	}
	
}
