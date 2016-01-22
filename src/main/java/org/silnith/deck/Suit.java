package org.silnith.deck;

/**
 * A suit for a playing card.
 * 
 * @author <a href="mailto:silnith@gmail.com">Kent Rosenkoetter</a>
 */
public enum Suit {
    CLUB(Color.BLACK),
    DIAMOND(Color.RED),
    HEART(Color.RED),
    SPADE(Color.BLACK);
    
    /**
     * A color for a playing card&#8217;s suit.
     * 
     * @author <a href="mailto:silnith@gmail.com">Kent Rosenkoetter</a>
     */
    public enum Color {
        BLACK,
        RED
    }
    
    private final Color color;
    
    private Suit(final Color color) {
        this.color = color;
    }
    
    /**
     * Returns the color of a particular suit.
     * 
     * @return the color of the suit
     */
    public Color getColor() {
        return color;
    }
    
    /**
     * Returns the Unicode symbol for the card suit.
     * 
     * <table>
     * <thead>
     * <tr>
     * <th>Suit</th>
     * <th>Symbol</th>
     * </tr>
     * </thead> <tbody>
     * <tr>
     * <td>{@link #CLUB}</td>
     * <td>&#x2663;</td>
     * </tr>
     * <tr>
     * <td>{@link #DIAMOND}</td>
     * <td>&#x2666;</td>
     * </tr>
     * <tr>
     * <td>{@link #HEART}</td>
     * <td>&#x2665;</td>
     * </tr>
     * <tr>
     * <td>{@link #SPADE}</td>
     * <td>&#x2660;</td>
     * </tr>
     * </tbody>
     * </table>
     * 
     * @return a single-character Unicode symbol
     */
    public String toSymbol() {
        switch (this) {
        case CLUB:
            return "\u2663";
        case DIAMOND:
            return "\u2666";
        case HEART:
            return "\u2665";
        case SPADE:
            return "\u2660";
        default:
            throw new NullPointerException();
        }
    }
    
    @Override
    public String toString() {
        switch (this) {
        case CLUB:
            return "Club";
        case DIAMOND:
            return "Diamond";
        case HEART:
            return "Heart";
        case SPADE:
            return "Spade";
        default:
            return super.toString();
        }
    }
    
}
