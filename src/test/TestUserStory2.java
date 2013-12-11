package test;

import org.junit.Test;

import core.StyleSMS;
import core.StyleSMSDefault;
import junit.framework.TestCase;


public class TestUserStory2 extends TestCase{
	
	@Test
	public void test_genererMessage_genere_helloWorld()  {
		StyleSMS monStyle=new StyleSMSDefault();
		assertEquals(monStyle.generateMessage(), "HelloWorld");
	}
	
	@Test
	public void test_genererMessage_avecNom_genere_helloWorldPlusNom()  {
		StyleSMS monStyle=new StyleSMSDefault();
		monStyle.changeParameter("MonNom");
		assertEquals(monStyle.generateMessage(), "HelloWorld MonNom");
	}
	
	@Test
	public void test_genererAutreMessage_genere_nouveauMessage()  {
		StyleSMS monStyle=new StyleSMSDefault();
		
		String premierMessage=monStyle.generateMessage();
		monStyle.changeParameter("MonNom1");
		System.out.println("Premier message : "+premierMessage);
		String secondMessage=monStyle.generateMessage();
		monStyle.changeParameter("MonNom2");
		System.out.println("Second message : "+secondMessage);
		
		assertFalse(premierMessage.equals(secondMessage));
	}
}

	
