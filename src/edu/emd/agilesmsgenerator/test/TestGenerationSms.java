package edu.emd.agilesmsgenerator.test;

import junit.framework.TestCase;


import edu.emd.agilesmsgenerator.core.StyleSMSDefault;


public class TestGenerationSms extends TestCase{
	
	private StyleSMSDefault monStyle;

	@Override
	protected void setUp() throws Exception {
		monStyle=new StyleSMSDefault();
		super.setUp();
	}

	public void test_genererMessage_genere_helloWorld()  {
		assertEquals(monStyle.generateMessage(), "HelloWorld ");
	}
	
	public void test_genererMessage_avecNom_genere_helloWorldPlusNom()  {
		monStyle.changeParameter("MonNom");
		assertEquals(monStyle.generateMessage(), "HelloWorld MonNom");
	}
	
	public void test_genererAutreMessage_genere_nouveauMessage()  {
		
		String premierMessage=monStyle.generateMessage();
		monStyle.changeParameter("MonNom1");
		String secondMessage=monStyle.generateMessage();
		monStyle.changeParameter("MonNom2");
		
		assertFalse(premierMessage.equals(secondMessage));
	}
}

	
