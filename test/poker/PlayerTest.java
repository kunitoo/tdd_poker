package poker;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    Player player;

    @Before
    public void init() {
        player = new Player();
    }

    @Test
    public void testIsOnePairTrue() {
        player.cards.add(Card.getInstance(1, Suit.Clubs));
        player.cards.add(Card.getInstance(1, Suit.Hearts));
        player.cards.add(Card.getInstance(2, Suit.Diamonds));
        player.cards.add(Card.getInstance(3, Suit.Clubs));
        player.cards.add(Card.getInstance(4, Suit.Clubs));
        assertTrue(player.isOnePair());
    }

    @Test
    public void testIsOnePairFalse() {
        player.cards.add(Card.getInstance(1, Suit.Clubs));
        player.cards.add(Card.getInstance(2, Suit.Diamonds));
        player.cards.add(Card.getInstance(3, Suit.Clubs));
        player.cards.add(Card.getInstance(4, Suit.Clubs));
        player.cards.add(Card.getInstance(5, Suit.Hearts));
        assertFalse(player.isOnePair());
    }

    @Test
    public void testIsTwoPairTrue() {
        player.cards.add(Card.getInstance(1, Suit.Clubs));
        player.cards.add(Card.getInstance(1, Suit.Diamonds));
        player.cards.add(Card.getInstance(2, Suit.Clubs));
        player.cards.add(Card.getInstance(2, Suit.Spades));
        player.cards.add(Card.getInstance(5, Suit.Hearts));
        assertTrue(player.isTwoPair());
    }
}
