package test;
import card.Card;
import card.MagicCard;
import junit.framework.TestCase;

public class TestMagicCard extends TestCase{
	
	
	Card c1, c2, c3;
	MagicCard mc1, mc2, mc3, mc4, mc5;
	
	
	public void setUp(){
		c1 = new Card(-1, -40, false, "this card is negative size");
		c2 = new Card(3, 4, true, "this card is normal and glossy");
		c3 = new Card(3, 4, true, "this card is normal and glossy");
		
		
		mc1 = new MagicCard(true, "Test Card", "this cards cost is negative which should default to 0", -3);
		mc2 = new MagicCard(false, "Giant Growth", "Instant - Target creature gets +3/+3", 1);
		mc3 = new MagicCard(false, "Free Giant Growth", "Instant - Target creature gets +3/+3", 0);
		mc4 = new MagicCard(true, "Titanic Growth", "Instant - Target creature gets +4/+4", 2);
		mc5 = new MagicCard(true, "Titanic Growth", "Instant - Target creature gets +4/+4", 2);
	}
	
	//testing Magic Card constructor and getters
	public void test01() {
		assertEquals(0, mc1.getCost());
		assertEquals(1, mc2.getCost());
		
		assertEquals("Test Card", mc1.getName());
		assertEquals("Free Giant Growth", mc3.getName());
		
		assertEquals("this cards cost is negative which should default to 0", mc1.getDescription());
		assertEquals("Instant - Target creature gets +4/+4", mc4.getDescription());
		
		assertTrue(mc1.isFoil());
		assertFalse(mc3.isFoil());
	}
	
	//testing inherited getters
	public void test02() {
		assertEquals(3.5, mc2.getHeight());
		assertEquals(2.5, mc1.getWidth());
		assertEquals("Giant Growth", mc2.getText());
	}
	

	//testing toString
	public void test03() {
		assertEquals("a 1 cmc Giant Growth.",mc2.toString());
		assertEquals("a foil 2 cmc Titanic Growth.",mc4.toString());
	}
	
	//testing equals
	public void test04() {
		assertFalse(mc1.equals(null));
		assertFalse(mc1.equals(mc2));
		assertTrue(mc4.equals(mc5));
		
		assertFalse(mc1.equals(c1));
		assertFalse(c2.equals(mc2));
	}
	
	
	//testing isBetter
	public void test05() {
		assertTrue(mc3.isBetter(mc2));
		assertFalse(mc4.isBetter(mc2));
		assertFalse(mc3.isBetter(mc4));
		assertFalse(mc1.isBetter(mc1));
		
		assertFalse(mc1.isBetter(null));
		MagicCard nullDesc = new MagicCard(true, "Titanic Growth", null, 2);
		assertFalse(nullDesc.isBetter(mc4));
		assertFalse(mc4.isBetter(nullDesc));
		MagicCard nullDescCheap = new MagicCard(true, "Titanic Growth", null, 0);
		assertFalse(nullDesc.isBetter(nullDescCheap));
		assertTrue(nullDescCheap.isBetter(nullDesc));
		
	}
}
