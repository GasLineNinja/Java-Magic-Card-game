package card;

public class PlayingCard extends Card {

	private int rank;
	
	
	public PlayingCard(double height, double width, int rank, String suit) {
	super(height, width, false, verifySuit(suit));
	
	this.rank = rank;
	suit = getText();
	
	if (this.rank < 1 || this.rank > 13) {this.rank = 1;}
	}
	
	private static String verifySuit(String suit) {
		if (suit == null) {return "Spade";}
		if (suit == "Club") {return "Club";}
		if (suit == "Diamond") {return "Diamond";}
		if (suit == "Heart") {return "Heart";}
		if (suit == " Spade") {return "Spade";}
		return "Spade";
	}
	
	public String toString() {
		return "a " + getRank() + " of " + getSuit() + "s.";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayingCard other = (PlayingCard) obj;
		if (rank != other.rank)
			return false;
		return true;
	}

	public String getRank() {
		if (rank == 1) {return "Ace";}
		if (rank == 2) {return "2";}
		if (rank == 3) {return "3";}
		if (rank == 4) {return "4";}
		if (rank == 5) {return "5";}
		if (rank == 6) {return "6";}
		if (rank == 7) {return "7";}
		if (rank == 8) {return "8";}
		if (rank == 9) {return "9";}
		if (rank == 10) {return "10";}
		if (rank == 11) {return "Jack";}
		if (rank == 12) {return "Queen";}
		if (rank == 13) {return "King";}
		return null;
	}

	public String getSuit() {
		return getText();
	}
	
	

}
