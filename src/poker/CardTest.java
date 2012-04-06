package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

    @Test
    public void testGetInstanceCard1() {
        Card result = Card.getInstance(1, Suit.Clubs);
        assertEquals(1, result.number.intValue());
        assertEquals(Suit.Clubs, result.suit);
    }

    @Test
    public void testGetInstanceCard13() {
        Card result = Card.getInstance(13, Suit.Clubs);
        assertEquals(13, result.number.intValue());
        assertEquals(Suit.Clubs, result.suit);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetInstanceNumber0IllegalArgumentException() {
        Card.getInstance(0, Suit.Clubs);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetInstanceNumber14IllegalArgumentException() {
        Card.getInstance(14, Suit.Clubs);
    }
}
