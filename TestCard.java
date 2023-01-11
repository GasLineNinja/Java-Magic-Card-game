package test;
import card.Card;
import junit.framework.TestCase;

public class TestCard extends TestCase{
	
	
	Card c1, c2, c3;
	
	
	public void setUp(){
		c1 = new Card(-1, -40, false, "this card is negative size");
		c2 = new Card(3, 4, true, "this card is normal and glossy");
		c3 = new Card(3, 4, true, "this card is normal and glossy");
	}
	
	
	//testing Card constructor and getters
	public void test01(){
		assertEquals(0.0, c1.getHeight());
		assertEquals(0.0, c1.getWidth());
		assertEquals("this card is negative size", c1.getText());
		
		assertEquals(3.0, c2.getHeight());
		assertEquals(4.0, c2.getWidth());
		assertEquals("this card is normal and glossy", c2.getText());
	}
	

	//testing toString
	public void test02() {
		assertEquals("a 0.0 by 0.0 inch card.", c1.toString());
		assertEquals("a 4.0 by 3.0 inch card.", c2.toString());
		assertEquals("a 4.0 by 3.0 inch card.", c3.toString());
	}
	
	//testing equals
	public void test03() {
		assertFalse(c1.equals(null));
		assertFalse(c1.equals(c2));
		assertTrue(c2.equals(c3));
	}
}
