package test;
import card.Card;
import card.PlayingCard;
import junit.framework.TestCase;

public class TestPlayingCard extends TestCase{
	
	
	Card c1, c2, c3;
	PlayingCard pc1, pc2, pc3, pc4, pc5, pc6, pc7;
	
	
	public void setUp(){
		c1 = new Card(-1, -40, false, "this card is negative size");
		c2 = new Card(3, 4, true, "this card is normal and glossy");
		c3 = new Card(3, 4, true, "this card is normal and glossy");
		
		
		pc1 = new PlayingCard(4, 4, 26, "Club");
		pc2 = new PlayingCard(-1, -1, -1, "hearts");
		pc3 = new PlayingCard(3, 4, 3, "Heart");
		pc4 = new PlayingCard(0, 0, 1, "Spade");
		pc5 = new PlayingCard(2, 1, 11, null);
		pc6 = new PlayingCard(2, 1, 12, "Spade");
		pc7 = new PlayingCard(2, 1, 13, "Diamond");
	}
	
	//testing Playing Card constructor and getters
	public void test01() {
		assertEquals("Ace", pc1.getRank());
		assertEquals("Ace", pc2.getRank());
		assertEquals("3", pc3.getRank());
		assertEquals("Ace", pc4.getRank());
		assertEquals("Jack", pc5.getRank());
		assertEquals("Queen", pc6.getRank());
		assertEquals("King", pc7.getRank());
		
		assertEquals("Club", pc1.getSuit());
		assertEquals("Spade", pc2.getSuit());
		assertEquals("Heart", pc3.getSuit());
		assertEquals("Spade", pc4.getSuit());
		assertEquals("Spade", pc5.getSuit());
		assertEquals("Diamond", pc7.getSuit());
	}
	
	//testing inherited getters
	public void test02() {
		assertEquals(4.0, pc1.getHeight());
		assertEquals(4.0, pc1.getWidth());
		assertEquals("Club", pc1.getText());
		
		assertEquals(0.0, pc2.getHeight());
		assertEquals(0.0, pc2.getWidth());
		assertEquals("Spade", pc2.getText());
	}
	

	//testing toString
	public void test03() {
		assertEquals("a Ace of Spades.", pc2.toString());
		assertEquals("a 3 of Hearts.", pc3.toString());
	}
	
	//testing equals
	public void test04() {
		assertFalse(pc1.equals(null));
		assertFalse(pc1.equals(pc2));
		assertTrue(pc2.equals(pc4));
		
		assertFalse(pc1.equals(c1));
		assertFalse(c2.equals(pc2));
	}
}
