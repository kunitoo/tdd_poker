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
        player.numbers.add(1);
        player.numbers.add(1);
        player.numbers.add(2);
        player.numbers.add(3);
        player.numbers.add(4);
        assertTrue(player.isOnePair());
    }
}
