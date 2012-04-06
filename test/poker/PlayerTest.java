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
        player.cards.add(new Card() {{number = 1;}});
        player.cards.add(new Card() {{number = 1;}});
        player.cards.add(new Card() {{number = 2;}});
        player.cards.add(new Card() {{number = 3;}});
        player.cards.add(new Card() {{number = 4;}});
        assertTrue(player.isOnePair());
    }

    @Test
    public void testIsOnePairFalse() {
        player.cards.add(new Card() {{number = 1;}});
        player.cards.add(new Card() {{number = 2;}});
        player.cards.add(new Card() {{number = 3;}});
        player.cards.add(new Card() {{number = 4;}});
        player.cards.add(new Card() {{number = 5;}});
        assertFalse(player.isOnePair());
    }
}
