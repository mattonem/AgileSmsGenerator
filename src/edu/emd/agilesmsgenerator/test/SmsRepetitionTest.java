package edu.emd.agilesmsgenerator.test;
import java.util.Date;

import org.junit.Test;

import junit.framework.TestCase;

//import org.junit.Test;

import edu.emd.agilesmsgenerator.core.Repetition;
import edu.emd.agilesmsgenerator.core.Sms;

public class SmsRepetitionTest extends TestCase{

		private Repetition uneRepetition;
		
		public void test_date_aujourdhui() {
			
			uneRepetition = new Repetition();
			
			assertEquals(uneRepetition.getDateActuel(), "11-12-13" );
			
		}


		
	
}
