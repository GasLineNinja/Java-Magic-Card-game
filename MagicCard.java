package card;
/*
 * A class that represents a card in the game Magic: the Gathering
 * It is a subclass of Card
 * It adds a description field and a cost field
 */
public final class MagicCard extends Card{

	private String description;
	private int cost;
	
	
	/**
	 * A magic card is always 3.5 inches tall and 2.5 inches wide.
	 * @param isFoil - a glossy magic card is called "foil"
	 * @param name - the text of the card
	 * @param description
	 * @param cost - the "cmc" or mana cost of this card. Can never be below 0.
	 */
	public MagicCard(boolean isFoil, String name, String description, int cost) {
		//TODO call the inherited constructor appropriately, and initialize the subclass fields
		super(3.5, 2.5, isFoil, name);
		isFoil = isGlossy;
		name = getText();
		this.description = description;
		this.cost = cost;
	}
	
	
	@Override
	public String toString() {
		//TODO
		//format if not foil: a <cost> cmc <name>.
		//format if foil: a foil <cost> cmc <name>.
		if (isFoil() == false) {
			return "a " + this.cost + " cmc " + getName() + ".";
		}
		else
		return "a foil "  + this.cost + " cmc " + getName() + ".";
	}

	
	
	/**
	 * A method that returns true if this card is strictly better than the other.
	 * Strictly better means that the description is the same (equal), and the cost is less
	 * Return false if other is null
	 * @param other the card to compare against
	 * @return true if this card is strictly better
	 */
	public boolean isBetter(MagicCard other) {
		//TODO write this method
		if (other == null) {
			return false;
		}
		if (this.getDescription() == other.getDescription() && this.getCost() < other.getCost()) {
			return true;
		}
		return false;
	}
	
	
	public final String getName() {
		//TODO return the name of the card
		return getText();
	}
	
	public final int getCost() {
		//TODO return the cost of the card
		if (cost < 0) {
			this.cost = 0;
		}
		return this.cost;
	}
	
	public final String getDescription() {
		//TODO return the description of the card
		return description;
	}

	public final boolean isFoil() {
		//TODO return whether the card is foil (glossy)
		return isGlossy;
	}


	//TODO use eclipse to generate an equals method
	//just like you did in Card
	//pay attention to what this does!
		


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MagicCard other = (MagicCard) obj;
		if (cost != other.cost)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}
	
	
	
}

