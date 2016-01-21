package org.silnith.deck;

/**
 * A numeric value for a playing card.
 * 
 * @author <a href="mailto:silnith@gmail.com">Kent Rosenkoetter</a>
 */
public enum Value {
	ACE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13);

	private final int value;

	private Value(final int value) {
		this.value = value;
	}

	/**
	 * Returns the numeric equivalent for the card value.
	 * 
	 * @return the numeric equivalent for the card value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Returns a short symbol representing the card value.  This is usually a
	 * single character, except for {@link #TEN}.
	 * 
	 * @return a short symbol representing the card value
	 */
	public String toSymbol() {
		switch (this) {
		case ACE: return "A";
		case JACK: return "J";
		case QUEEN: return "Q";
		case KING: return "K";
		default: return String.valueOf(value);
		}
	}

	@Override
	public String toString() {
		switch (this) {
		case ACE: return "Ace";
		case TWO: return "Two";
		case THREE: return "Three";
		case FOUR: return "Four";
		case FIVE: return "Five";
		case SIX: return "Six";
		case SEVEN: return "Seven";
		case EIGHT: return "Eight";
		case NINE: return "Nine";
		case TEN: return "Ten";
		case JACK: return "Jack";
		case QUEEN: return "Queen";
		case KING: return "King";
		default: return super.toString();
		}
	}

}
