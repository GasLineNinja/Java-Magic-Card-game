package card;
/*
 * A class that represents a physical card
 */
public class Card {

	private double height;
	private double width;
	private String text;
	protected boolean isGlossy;
	
	
	

	public Card(double height, double width, boolean isGlossy, String text) {
		//TODO assign fields. Minimum height and width should be 0
		this.height = height;
		this.width = width;
		this.isGlossy = isGlossy;
		this.text = text;
		
		if (height < 0) {this.height = 0.0;}
		if (width < 0) {this.width = 0.0;}
	}
	
	
	@Override
	public String toString() {
		//TODO return a String
		//format: “a <width> by <height> inch card.”
		return "a " + getWidth() + " by " + getHeight() + " inch card.";
	}
	
	//TODO use eclipse to generate an equals method
	//Source -> Generate hashCode() and equals()...
	//you don't need to supply a hashCode method


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (isGlossy != other.isGlossy)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}



	public final String getText() {
		return text;
	}
	
	//TODO write the following public methods from scratch
	//they should all be final!!!
	
	//getHeight: return the height
	public final double getHeight() {
		return this.height;
	}
	
	//getWidth: return the width
	public final double getWidth() {
		return this.width;
	}
	
	
}
