package edu.emd.agilesmsgenerator.test;
import junit.framework.TestCase;
import edu.emd.agilesmsgenerator.core.Repetition;

public class SmsRepetitionTest extends TestCase{

		private Repetition uneRepetition;
		
		@Override
		protected void setUp() throws Exception {
			uneRepetition = new Repetition();
			super.setUp();
		}

		public void test_date_aujourdhui() {
			
			assertEquals(uneRepetition.getDateActuel(), "11-12-13" );
			
		}
	
}
